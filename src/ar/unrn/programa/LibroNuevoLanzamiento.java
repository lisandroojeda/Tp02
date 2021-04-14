package ar.unrn.programa;

public class LibroNuevoLanzamiento extends Libro{
    private static double precio =0;

    public LibroNuevoLanzamiento(String nombre) {
        super(nombre);
    }

    @Override
    public double Precio() {
        return precio;
    }



}
