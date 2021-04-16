package ar.unrn.programa;

public class LibroRegulares extends Libro{
    private static double precio = 2;
    public LibroRegulares(String nombre) {
        super(nombre);
    }

    @Override
    public double precio(int diasAlquilados) {
        if (diasAlquilados>2)
            return precio + (diasAlquilados - 2) * 1.5;
        return  precio;
    }

    @Override
    public int calcularPuntos(int diasAlquilados) {
        return 1;
    }
}
