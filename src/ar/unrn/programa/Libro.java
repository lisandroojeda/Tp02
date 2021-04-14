package ar.unrn.programa;
//Se convirtio en abstracta la clase Libro con el fin de abstraer el tipo de
//libro que paso en la clase cliente
public abstract class Libro {

    private String nombre;

    public Libro(String nombre) {
        this.nombre = nombre;
    }
    public String nombre() {
        return nombre;
    }

    public abstract double Precio();


}
