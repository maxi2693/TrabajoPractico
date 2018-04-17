package mundiadefutbol;

import java.util.Objects;



public class Partido {
    //Variables:
   
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;
    //Constructor : 
    public Partido( Equipo local, Equipo visitante) {
        
        this.visitante = visitante;
        this.local = local;

    }
    //Devuelve un resultado
    public Resultado getResultado(){
        return resultado;
    }
    //Retorna el equipo local
    public Equipo getLocal(){
        return local;
    }
    //Retorna el equipo Visitante
    public Equipo getVisitante(){
        return visitante;
    }


    
}
