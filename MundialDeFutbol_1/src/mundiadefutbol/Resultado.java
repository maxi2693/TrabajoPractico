package mundiadefutbol;

public class Resultado {

    //Definicion de variables
    private int golesLocal;
    private int golesVisitante;

    //Al no crear el constructor se define uno por default
    
    //Metodos :
    
    //Devuelve cantidad de goles de Local
    public int getGolesLocal() {
        return this.golesLocal;
    }

    //Devuelve cantidad de goles de Visitante
    public int getGolesVisitante() {
        return this.golesVisitante;
    }

    //Ingresamos los goles de Local
    public void setLocal(int Local) {
        this.golesLocal = Local;
    }

    //Ingresamos los goles de Visitante
    public void setVisitante(int Visitante) {
        this.golesVisitante = Visitante;
    }

    //Se comparan la cantidad de goles y se determina al ganador mediante un boolean
    public boolean ganoLocal() {
        if (this.golesLocal > this.golesVisitante) {

            return true;

        } else {
            return false;
        }
    }

    //Si los resultados son iguales empate retorna true
    public boolean empate() {
        if (this.golesLocal == this.golesVisitante) {

            return true;
        } else {
            return false;
        }
    }

}
