public class GestioneClassifica {
    private static final int massimo_persone = 10;
    private Persona classifica[];
    private int casellaLibera = 0;

    public GestioneClassifica(){
        classifica = new Persona [massimo_persone];
    }

    public int cercaPersona(String persona){
        int output = -2;
        int i = 0;
        boolean trovato = false;
        if (persona!=null){
            while (i < classifica.length && !trovato){
                if (classifica[i]!=null && classifica[i].getNominativo()!=null){
                    if (classifica[i].getNominativo().equals(persona)){
                        output = i;
                        trovato = true;
                    } else {
                        output = -1;
                    }
                }
                i++;
            }
        }

        return output;
    }

    public void setPersona(Persona persona){
        if (persona!=null){
            int i = 0;
            boolean trovato = false;
            if (casellaLibera < classifica.length){
                while (i <casellaLibera && !trovato){
                    if (persona.getPunteggio()>classifica[i].getPunteggio()){
                        for (int j = casellaLibera-1; j > i; j--){
                            classifica[j+1] = classifica[j];
                        }
                        classifica[i] = persona;
                        trovato = true;
                    }
                    i++;
                }
                if (!trovato){
                    classifica[casellaLibera] = persona;
                }
                casellaLibera++;
            }
        }

    }

    public double calcoloMedia(){
        double media = 0;
        for (int i = 0; i < casellaLibera; i++){
            media += classifica[i].getPunteggio();
        }
        media = media / casellaLibera;

        return media;
    }


}
