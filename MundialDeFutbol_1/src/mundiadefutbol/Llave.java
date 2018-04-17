
package mundiadefutbol;
import java.util.ArrayList;
import java.util.List;

public class Llave {
    
 
      List<Equipo> equiposQueAvanzan = new ArrayList();
    //Devuelve los puntos dependiendo si gano como Local o Visitante y si empato o no.
    private int getPuntos(Equipo e) {
        int puntos = 0;
        for (Partido partidos : e.getPartidosJugados()) {
            if (partidos.getResultado().ganoLocal() && e.getNombre().equals(partidos.getLocal())) {
                puntos += 3;

            }
            if (!partidos.getResultado().empate() && !partidos.getResultado().ganoLocal() && e.getNombre().equals(partidos.getVisitante())) {
                puntos += 3;
            }
            if (partidos.getResultado().empate()) {
                puntos += 1;
            }
        }
        return puntos;
    }

   
    public List<Equipo> getEquiposQueAvanzan() {
        /*Equipo equipoAux = new Equipo();
        for (Partido partido : super.getPartidos()) {
            if (getPuntos(partido.getLocal() > getPuntos(partido.getVisitante())) {
                
            }
        }
         equiposQueAvanzan.add(equipoAux);
      */  return equiposQueAvanzan;
    }
}
