package ar.unrn.programa;

public class Alquiler  {
    protected CopiaLibro copia;
    protected int diasAlquilados;


    public Alquiler(CopiaLibro copia, int diasAlquilados){
        this.copia = copia;
        this.diasAlquilados = diasAlquilados;
    }
    public double calcularMonto(){
        return copia.precio(diasAlquilados);
    };
    public int calcularPuntos(){
        return copia.puntos(diasAlquilados);
    };
    }

