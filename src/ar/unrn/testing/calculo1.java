package ar.unrn.testing;

import ar.unrn.programa.Alquiler;
import ar.unrn.programa.Cliente;
import ar.unrn.programa.CopiaLibro;
import ar.unrn.programa.Libro;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class calculo1 {

    @Test
    public void calculoDelPago(){
        Libro elTunel = new Libro("El Túnel", Libro.REGULARES);
        Libro antesDelFin = new Libro("Antes del Fin", Libro.REGULARES);
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
