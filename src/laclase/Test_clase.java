
package laclase;

import java.util.ArrayList;

/**
 *
 * @author accel
 */
public class Test_clase {
    public static ArrayList<Personas> Caso1 = new ArrayList<Personas>();
    public static void main(String[] args) {
        Personas Caso_Est = new Estudiantes("pedro", "masculino", 20, 5, 9, 60, 60, "calculo");
        Personas Caso_Docen = new Profesor("accel", "masculino", 40, 1, "calculo", 3);
        
        Caso1.add(Caso_Est);
        Caso1.add(Caso_Docen);
        
        for (Personas Aula : Caso1){
            System.out.println(Aula);
        }
        
    }
}