package ar.unrn.programa;

public class Main {
    public static void main(String args[]) {
        LibroRegulares elTunel = new LibroRegulares("El Túnel");
        LibroRegulares antesDelFin = new LibroRegulares("Antes del Fin");
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        AlquilerRegulares alquilerElTunel = new AlquilerRegulares(elTunelCopia, 5);
        AlquilerRegulares alquilerAntesDelFin = new AlquilerRegulares(antesDelFinCopia, 3);
        AlquilerRegulares alquilerAntesDelFin2 = new AlquilerRegulares(antesDelFinCopia, 5);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        System.out.println(resultado[0]);
        System.out.println(resultado[1]);
    }
}
