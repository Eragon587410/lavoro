public class Persona {
    private String nominativo;
    private int punteggio;


    public Persona(){
        punteggio = 0;
    }

    public Persona(String nominativo, int punteggio){
        this();
        setNominativo(nominativo);
        setPunteggio(punteggio);
    }

    public Persona(Persona persona){
        this(persona.getNominativo(), persona.getPunteggio());
    }

    public void setNominativo(String nominativo){
        this.nominativo = nominativo;
    }

    public void setPunteggio(int punteggio){
        if (punteggio>=0 && punteggio <= 10){
            this.punteggio = punteggio;
        }
    }

    public String getNominativo(){
        return nominativo;
    }

    public int getPunteggio(){
        return punteggio;
    }

   

    public int equals(Persona persona){
        int output = -2;
        if (persona!=null && this!=null && persona.getNominativo()!=null && this.getNominativo()!=null){
            
            if (persona.getNominativo().equals(this.getNominativo())){
                output = 1;
            } else {
                output = -1;
            }
            
        }
        return output;
    }

    

    
}
