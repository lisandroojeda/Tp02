package ar.unrn.programa;

public class CopiaLibro {
    private Libro libro;
    public CopiaLibro(Libro libro) {
        this.libro = libro;
    }
    public Libro libro() {
        return libro;
    }

    public double precio(int diasAlquilado){
        return libro.precio(diasAlquilado);
    }

    public int puntos(int diasAlquilado){
        return libro().calcularPuntos(diasAlquilado);
    }

}
