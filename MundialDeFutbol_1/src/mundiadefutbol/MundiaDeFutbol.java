package mundiadefutbol;

import java.util.Arrays;

public class MundiaDeFutbol {

    public static void main(String[] args) {

      EtapaMundial primeraEtapa;

        Equipo e1 = new Equipo();
        e1.setNombre("Argentina");

        Equipo e2 = new Equipo();
        e2.setNombre("Brasil");

        Equipo e3 = new Equipo();
        e3.setNombre("Chile");

        Equipo e4 = new Equipo();
        e4.setNombre("Rusia");

        primeraEtapa = new Grupo();

        Partido p1 = new Partido(e1, e2);
        Partido p2 = new Partido(e2, e1);
        Partido p3 = new Partido(e3, e4);
        Partido p4 = new Partido( e4, e3);
        Partido p5 = new Partido( e1, e3);
        Partido p6 = new Partido( e3, e1);
        Partido p7 = new Partido( e1, e4);
        Partido p8 = new Partido( e4, e1);
        Partido p9 = new Partido(e2, e3);
        Partido p10 = new Partido( e3, e2);
        Partido p11 = new Partido( e2, e4);
        Partido p12 = new Partido( e4, e2);
        
        Partido [] partidoss =  {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12};
        for (int i = 0; i < partidoss.length; i++) {
            primeraEtapa.addPartido(partidoss[i]);
        }
        
        
        
        p1.getResultado().setLocal(10);
        p1.getResultado().setVisitante(2);
        
        p2.getResultado().setLocal(2);
        p2.getResultado().setVisitante(10);
        
        
        p3.getResultado().setLocal(2);
        p3.getResultado().setVisitante(3);
       
        p4.getResultado().setLocal(4);
        p4.getResultado().setVisitante(2);
        
        p5.getResultado().setLocal(2);
        p5.getResultado().setVisitante(2);
        
        p6.getResultado().setLocal(2);
        p6.getResultado().setVisitante(2);
        
        p7.getResultado().setLocal(2);
        p7.getResultado().setVisitante(2);
        
        p8.getResultado().setLocal(2);
        p8.getResultado().setVisitante(2);
       
        p9.getResultado().setLocal(2);
        p9.getResultado().setVisitante(2);
        
        p10.getResultado().setLocal(2);
        p10.getResultado().setVisitante(2);
       
        p11.getResultado().setLocal(2);
        p11.getResultado().setVisitante(2);
        
        p12.getResultado().setLocal(2);
        p12.getResultado().setVisitante(2);

        e1.setPartidosJugados(p1);
        e1.setPartidosJugados(p2);
        e1.setPartidosJugados(p5);
        e1.setPartidosJugados(p6);
        e1.setPartidosJugados(p7);
        e1.setPartidosJugados(p8);
       
        e2.setPartidosJugados(p1);
        e2.setPartidosJugados(p2);
        e2.setPartidosJugados(p9);
        e2.setPartidosJugados(p10);
        e2.setPartidosJugados(p11);
        e2.setPartidosJugados(p12);
        
        e3.setPartidosJugados(p3);
        e3.setPartidosJugados(p4);
        e3.setPartidosJugados(p5);
        e3.setPartidosJugados(p6);
        e3.setPartidosJugados(p9);
        e3.setPartidosJugados(p10);

        e4.setPartidosJugados(p3);
        e4.setPartidosJugados(p4);
        e4.setPartidosJugados(p7);
        e4.setPartidosJugados(p8);
        e4.setPartidosJugados(p11);
        e4.setPartidosJugados(p12);

    }

}