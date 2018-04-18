package MundialRusia2018;

import java.util.ArrayList;
import java.util.List;

public abstract class EtapaMundial {

    private String descripcionEtapa;
    private List<Partido> partidos;

    //El ejercicio 1 pide que se inicialize en el constructor la lista
    public EtapaMundial() {
        partidos = new ArrayList();
    }
    //Carga la descripcion de la etapa
    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }
    
    
    //Devuelve una descripcion de la etapa
    public String getDescripcionEtapa() {
        return this.descripcionEtapa;
    }

    //Añade un partido a la lista
    public void addPartido(Partido unPartido) {
        partidos.add(unPartido);
    }

    //Retorna la lista de partidos
    protected List<Partido> getPartidos() {
        return partidos;
    }

    //Metodo abastracto (lo que convierte a esta clase en abstracta)
    public abstract List<Equipo> getEquiposQueAvanzan();

}
