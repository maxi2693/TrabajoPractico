package MundialRusia2018;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Llave extends EtapaMundial {

    List<Equipo> equiposPasan = new ArrayList<>();
    Partido unPartido;
    public Llave (String descripcionEtapa){
        super.setDescripcionEtapa(descripcionEtapa);
    }
    @Override
    public List<Equipo> getEquiposQueAvanzan() {
        //Devuelve una lista con el ganador
        for (Iterator<Partido> verEquipo = this.getPartidos().iterator(); verEquipo.hasNext();) {
            
                unPartido = verEquipo.next();
                if (unPartido.getResultado().ganoLocal()) {
                    equiposPasan.add(unPartido.getLocal());
                    System.out.println("Equipo local pasa : "+unPartido.getLocal().getNombre());
                    //Guarda el equipo local que gano
            }
                //se verifica si gano el visitante
             else {
                    if (!unPartido.getResultado().ganoLocal() && (!unPartido.getResultado().empate())) {
                        equiposPasan.add(unPartido.getVisitante());
                        System.out.println("Equipo visitante pasa : "+unPartido.getVisitante().getNombre());
                    }
                    
               
            }
        }

        return equiposPasan;
    }
}
