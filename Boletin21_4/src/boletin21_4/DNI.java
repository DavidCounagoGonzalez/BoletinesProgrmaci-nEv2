
package boletin21_4;

import javax.swing.JOptionPane;


public class DNI {
    public static void calculo(){
        int digitos=Integer.parseInt(JOptionPane.showInputDialog("EScribe los digitos de tu dni: "));
        int resto=digitos%23;
        System.out.println(resto);
        String letras[];
        int restos[];
        letras=new String[]{"A","B","C","D","E","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","W","X","Y","Z"};
        restos=new int[]{3,11,20,9,22,7,4,18,13,21,19,5,12,8,16,1,15,0,17,2,10,6,14};
}
}
