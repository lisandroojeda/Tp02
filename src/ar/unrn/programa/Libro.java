package ar.unrn.programa;
//Se convirtio en abstracta la clase Libro con el fin de abstraer el tipo de
//libro que paso en la clase cliente
public class Libro {
    public static final int INFANTILES = 2;
    public static final int REGULARES = 0;
    public static final int NUEVO_LANZAMIENTO = 1;

    private String nombre;
    private int codigoPrecio;

    public Libro(String nombre, int priceCode) {
        this.nombre = nombre;
        this.codigoPrecio = priceCode;
    }
    public int codigoPrecio() {
        return codigoPrecio;
    }
    public String nombre() {
        return nombre;
    }

}
