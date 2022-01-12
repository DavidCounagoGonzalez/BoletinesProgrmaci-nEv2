
package boletin18;

public class Boletin18 {

    public static void main(String[] args) {
    ConversorTemperaturas excepcion=new ConversorTemperaturas();
    
   try{
        excepcion.centigradosAFharenheit(0);
                
    }
    catch(TemperaturaErradaExcepcion ex){
        System.out.println("Error: "+ ex.toString());
    }
        excepcion.centigradosAReamur();
    }
    
}
