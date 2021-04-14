package ar.unrn.programa;

public class LibroRegulares extends Libro{
    private static double precio = 2;
    public LibroRegulares(String nombre) {
        super(nombre);
    }

    @Override
    public double Precio() {
        return precio;
    }
}
