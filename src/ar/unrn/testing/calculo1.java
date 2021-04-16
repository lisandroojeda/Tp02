package ar.unrn.testing;

import ar.unrn.programa.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class calculo1 {

    @Test
    public void calculoDelPago(){
        LibroRegulares elTunel = new LibroRegulares("El Túnel");
        LibroRegulares antesDelFin = new LibroRegulares("Antes del Fin");
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();

        assertArrayEquals( new Object[]{10.0, 2},resultado);

    }
}
