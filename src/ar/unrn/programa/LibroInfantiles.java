package ar.unrn.programa;

public class LibroInfantiles extends Libro{
    private static double precio = 1.5;
    public LibroInfantiles(String nombre) {
        super(nombre);
    }

    @Override
    public double precio(int diasAlquilados) {
        if (diasAlquilados > 3)
            return precio + (diasAlquilados - 3) * 1.5;
        return precio;
    }

    @Override
    public int calcularPuntos(int diasAlquilados) {
        return 1;
    }

}
