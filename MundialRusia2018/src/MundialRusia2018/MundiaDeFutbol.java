package MundialRusia2018;

import java.util.ArrayList;
import java.util.List;

public class MundiaDeFutbol {

    public static void main(String[] args) {

        EtapaMundial primeraEtapa;
        primeraEtapa = new Grupo();

        Equipo e1 = new Equipo();
        e1.setNombre("Argentina");

        Equipo e2 = new Equipo();
        e2.setNombre("Brasil");

        Equipo e3 = new Equipo();
        e3.setNombre("Chile");

        Equipo e4 = new Equipo();
        e4.setNombre("Rusia");

        //Creo los partidos y les asigno a cada equipo su partido donde participo y uso el metodo "add partido" de etapa mundial para cargar los partidos en la lista de partidos
        Partido p1 = new Partido(e1, e2);
        p1.setLocal(e1);
        p1.setVisitante(e2);
        e1.setPartidosJugados(p1);
        e2.setPartidosJugados(p1);
        primeraEtapa.addPartido(p1);

        Partido p2 = new Partido(e2, e3);
        p2.setLocal(e2);
        p2.setVisitante(e3);
        e2.setPartidosJugados(p2);
        e3.setPartidosJugados(p2);
        primeraEtapa.addPartido(p2);

        Partido p3 = new Partido(e3, e4);
        p3.setLocal(e3);
        p3.setVisitante(e4);
        e3.setPartidosJugados(p3);
        e4.setPartidosJugados(p3);
        primeraEtapa.addPartido(p3);

        Partido p4 = new Partido(e1, e3);
        p4.setLocal(e1);
        p4.setVisitante(e3);
        e1.setPartidosJugados(p4);
        e3.setPartidosJugados(p4);
        primeraEtapa.addPartido(p4);

        Partido p5 = new Partido(e1, e4);
        p5.setLocal(e1);
        p5.setVisitante(e4);
        e1.setPartidosJugados(p5);
        e4.setPartidosJugados(p5);
        primeraEtapa.addPartido(p5);

        Partido p6 = new Partido(e2, e4);
        p6.setLocal(e2);
        p6.setVisitante(e4);
        e2.setPartidosJugados(p6);
        e4.setPartidosJugados(p6);
        primeraEtapa.addPartido(p6);

        //Cargo los goles de los equipos tanto de local como de visitante y tambien los goles convertidos y recibidos
        // partido 1 : e1 vs e2 - e1 local e2 visitante
        p1.getResultado().setLocal(10);
        p1.getResultado().setVisitante(2);
        e1.setGolesConvertidos(10);
        e1.setGolesRecibidos(2);
        e2.setGolesConvertidos(2);
        e2.setGolesRecibidos(10);

        //partido 2 : e1 vs e2 - local = e2 - V = e3
        p2.getResultado().setLocal(2);
        p2.getResultado().setVisitante(10);
        e2.setGolesConvertidos(2);
        e2.setGolesRecibidos(10);
        e3.setGolesConvertidos(10);
        e3.setGolesRecibidos(2);

        //Partido 3 : L = e3 - V = e4
        p3.getResultado().setLocal(2);
        p3.getResultado().setVisitante(3);
        e3.setGolesConvertidos(2);
        e3.setGolesRecibidos(3);
        e4.setGolesConvertidos(3);
        e4.setGolesRecibidos(2);
        //Partido 4 : L = e1 - V = e3
        p4.getResultado().setLocal(4);
        p4.getResultado().setVisitante(2);
        e1.setGolesConvertidos(4);
        e1.setGolesRecibidos(2);
        e3.setGolesConvertidos(2);
        e3.setGolesRecibidos(4);
        //Partido 5: L = e1 - V = e4
        p5.getResultado().setLocal(2);
        p5.getResultado().setVisitante(1);
        e1.setGolesConvertidos(2);
        e1.setGolesRecibidos(1);
        e4.setGolesConvertidos(1);
        e4.setGolesRecibidos(2);
        //PArtido 6: L = e2 - V = e4
        p6.getResultado().setLocal(2);
        p6.getResultado().setVisitante(1);
        e2.setGolesConvertidos(2);
        e2.setGolesRecibidos(1);
        e4.setGolesConvertidos(1);
        e4.setGolesRecibidos(2);

        primeraEtapa.getEquiposQueAvanzan();

        Llave llaveFinal = new Llave("final");

        llaveFinal.addPartido(p6);
        llaveFinal.addPartido(p3);

        llaveFinal.getEquiposQueAvanzan();

    }
}
