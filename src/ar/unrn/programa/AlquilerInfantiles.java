package ar.unrn.programa;

public class AlquilerInfantiles extends Alquiler{

    private double porcentajeAumento = 1.5;
    private int topeDias = 3;

    public AlquilerInfantiles(CopiaLibro copia, int diasAlquilados) {
        super(copia, diasAlquilados);
    }


    @Override
    public double calcularMonto() {
        if (diasAlquilados > 3)
         return copia.precio() + (diasAlquilados - topeDias) * porcentajeAumento;
        return copia.precio();

    }

    @Override
    public int calcularPuntos() {
        return 1;
    }
}
