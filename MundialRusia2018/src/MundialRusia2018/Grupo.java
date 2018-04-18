package MundialRusia2018;

import java.util.ArrayList;
import java.util.List;

public class Grupo extends EtapaMundial {

    //Devuelve los puntos dependiendo si gano como Local o Visitante y si empato o no.
    private int getPuntos(Equipo e) {
       
        int puntoss = 0;
        for (Partido partidos : e.getPartidosJugados()) {
            if (partidos.getResultado().ganoLocal() && e.getNombre().equals(partidos.getLocal())) {

                puntoss += 3;

            }
            if (!partidos.getResultado().empate() && !partidos.getResultado().ganoLocal() && e.getNombre().equals(partidos.getVisitante())) {
                puntoss += 3;
            }
            if (partidos.getResultado().empate()) {

                puntoss += 1;
            }
        }

        return puntoss;
    }
    //Devuelve una lista de equipos que avanzan a la otra fase
    @Override
    public List<Equipo> getEquiposQueAvanzan() {
        
        List<Equipo> equiposQuePasan = new ArrayList<>();
        Equipo equipoo = new Equipo();
        for (Partido partido : super.getPartidos()) {
            
            if (getPuntos(partido.getLocal()) > getPuntos(partido.getVisitante())) {
                equiposQuePasan.add(partido.getLocal());
                equipoo = partido.getLocal();
                

            }
            if (getPuntos(partido.getVisitante()) > getPuntos(partido.getLocal()) ) {
                equiposQuePasan.add(partido.getVisitante());
                
            }
        }
       
        
       return equiposQuePasan;
    
    }
}
        

    

