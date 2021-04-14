package ar.unrn.programa;

public class LibroInfantiles extends Libro{
    private static double precio = 1.5;
    public LibroInfantiles(String nombre) {
        super(nombre);
    }

    @Override
    public double Precio() {
        return precio;
    }
}
