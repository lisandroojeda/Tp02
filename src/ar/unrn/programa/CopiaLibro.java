package ar.unrn.programa;

public class CopiaLibro {
    private Libro libro;
    public CopiaLibro(Libro libro) {
        this.libro = libro;
    }
    public Libro libro() {
        return libro;
    }
}
