
package boletin18;

import javax.swing.JOptionPane;

public class ConversorTemperaturas {
   private final float temperatura=80;
   
   double centigrados=Float.parseFloat(JOptionPane.showInputDialog("Introuce a temperatura en centigrados: "));
   
   public double centigradosAFharenheit(double fharenheit)throws TemperaturaErradaExcepcion{
       
       if(centigrados<80){
           throw new TemperaturaErradaExcepcion ("Error de conversion.");
       }
       else{
       fharenheit=((9/5*centigrados)+32);
           System.out.println("Fharenheit= "+fharenheit);
       return fharenheit;
       }
      
   }
   
   public void centigradosAReamur (){
       double reamur=(0.8*centigrados);
       System.out.println("Reamur= "+reamur);
       
   }
}
