package ar.unrn.programa;

public abstract class Alquiler  {
    protected CopiaLibro copia;
    protected int diasAlquilados;


    public Alquiler(CopiaLibro copia, int diasAlquilados){
        this.copia = copia;
        this.diasAlquilados = diasAlquilados;
    }
    abstract double calcularMonto();
    abstract int calcularPuntos();
    }

