package laclase;

/**
 *
 * @author accel
 */
public abstract class Personas {

    String nombre, sexo;
    int edad, falta;

    public Personas(String nombre, String sexo, int edad, int falta) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.falta = falta;
    }

    public abstract int novillos();
}
