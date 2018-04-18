package MundialRusia2018;



public class Partido {
    //Variables:
   
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado = new Resultado();
    //Constructor : 
    public Partido( Equipo local, Equipo visitante) {
        
        this.visitante = visitante;
        this.local = local;

    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
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
