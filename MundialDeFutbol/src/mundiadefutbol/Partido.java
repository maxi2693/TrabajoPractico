package mundiadefutbol;

import java.util.Date;

public class Partido {
    //Variables:
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;
    //Constructor : 
    public Partido(Date fecha, Equipo local, Equipo visitante) {
        this.fecha = fecha;
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
