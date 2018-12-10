
package laclase;

/**
 *
 * @author accel
 */
public class Estudiantes extends Personas{
    double calFinal;
    int maxEst, id;
    String materia;

    public Estudiantes(String nombre, String sexo, int edad, int falta, double calFinal, int maxEst,int id, String materia) {
        super(nombre, sexo, edad, falta);
        this.calFinal = calFinal;
        this.maxEst = maxEst;
        this.id = id;
        this.materia = materia;
    }
   
    
    @Override
    public int novillos(){
        return (falta);
    }
    public int edad(){
        if (edad > 25){
            try {
                throw new Excepciones();
            } catch (Excepciones excepcion_Persona) {
                System.err.println(excepcion_Persona.getMessage());
            }
        }
        return (edad);
    }
     
    public double nota(){
        if (calFinal > 10){
            try {
                throw new Excepciones2();
            } catch (Excepciones2 excepcion_Persona2) {
                System.err.println(excepcion_Persona2.getMessage());
            }
        }
        return (calFinal);
    } 
    
    public double aprobacion(){
        if (calFinal < 6){
            System.err.println("ESTUDIANTE NO APROBADO");
        }
        if (falta > 5){
            System.err.println("FALTAS MAYORES AL NUMERO ESTABLECIDO");
        }
        return (calFinal);
    }
    
    @Override
    public String toString(){
        novillos();
        return ("\tAULA N° "+id+"\n"
                + "N° MAXIMO DE ESTUDIANTES PERMITIDOS == "+maxEst+"\n"
                + "MATERIA == "+materia+"\n"
                + "NOMBRE DEL ESTUDIANTE: "+nombre+"\n"
                + "SEXO: "+sexo+"\n"
                + "EDAD: "+edad()+"\n"
                + "NOTA: "+nota()+"\n"
                + "APROBACION: "+aprobacion());
    }
    
     
    
}
