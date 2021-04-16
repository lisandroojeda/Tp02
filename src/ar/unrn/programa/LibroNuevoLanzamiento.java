package ar.unrn.programa;

public class LibroNuevoLanzamiento extends Libro{
    private static double precio =0;

    public LibroNuevoLanzamiento(String nombre) {
        super(nombre);
    }

    @Override
    public double precio(int diasAlquilados) {
        return  precio + (diasAlquilados ) * 3;
    }

    @Override
    public int calcularPuntos(int diasAlquilados) {
        if (diasAlquilados>1)
            return 2;
        return 0;
    }


}
