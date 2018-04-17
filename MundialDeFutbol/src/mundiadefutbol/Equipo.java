package mundiadefutbol;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    //Variables:
    private String nombre;
    private List<Partido> partidosJugados = new ArrayList();
    private int golesRecibidos;
    private int golesConvertidos;
    

    //Metodos:
    public String getNombre() {
        return this.nombre;
    }
   
    //Devuelve el nombre del equipo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // * Getters y Setters  de goles recibidos y convertidos
    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public int getGolesConvertidos() {
        return golesConvertidos;
    }

    public void setGolesConvertidos(int golesConvertidos) {
        this.golesConvertidos = golesConvertidos;
    }
    //
    

    //Devuelve la diferencia de goles , por ejemplo : Si recibe 2 goles y convirtio 8, la diferencia es de 6 (EJERCICIO 2)
    public int getDiferenciaDeGoles() {
        return (this.golesRecibidos - this.golesConvertidos);
       
    }
    //Carga los partidos jugados
    public void setPartidosJugados(Partido p){
        partidosJugados.add(p);
    }
    //Devuelve partidos jugados
    public List<Partido> getPartidosJugados() {
        return partidosJugados;
    }

}
