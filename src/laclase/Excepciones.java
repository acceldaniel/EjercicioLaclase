
package laclase;

/**
 *
 * @author accel
 */
public class Excepciones extends Exception{
    public Excepciones(){
        super("EDAD INVALIDA");
        
    }
    public Excepciones(String msg){
        super (msg);
    }
}
class Excepciones2 extends Exception{
    public Excepciones2(){
        super ("NOTA INGRESADA INVALIDA");
    }
    public Excepciones2(String msg2){
        super (msg2);
    }
}