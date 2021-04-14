package ar.unrn.programa;

public class AlquilerNuevoLanzamiento extends Alquiler {


    private static double porcenteajeAumento = 3;
    private int topeDias = 0;

    public AlquilerNuevoLanzamiento(CopiaLibro copia, int diasAlquilados) {
        super(copia, diasAlquilados);
    }


    @Override
    public double calcularMonto() {
        return  copia.precio() + (diasAlquilados - topeDias) * porcenteajeAumento;
    }

    @Override
    public int calcularPuntos() {
        if (diasAlquilados>1)
        return 2;
        return 0;
    }
}
