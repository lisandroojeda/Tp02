package ar.unrn.programa;

public class AlquilerRegulares extends  Alquiler{

    private double porcentajeAumento = 1.5;
    private int topeDias = 2;

    public AlquilerRegulares(CopiaLibro copia, int diasAlquilados) {
        super(copia, diasAlquilados);
    }


    @Override
    public double calcularMonto() {
        if (diasAlquilados>2)
            return copia.precio() + (diasAlquilados - topeDias) * porcentajeAumento;
        return  copia.precio();
    }

    @Override
    public int calcularPuntos() {
        return 1;
    }
}
