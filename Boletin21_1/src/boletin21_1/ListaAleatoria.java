
package boletin21_1;

import java.util.Arrays;


public class ListaAleatoria {
    public static void crearAleatoria(){
        int[]listaAleatoria=new int[6];
        for (int i=0;i<listaAleatoria.length;i++){
            listaAleatoria[i]= (int) (Math.random()*50)+1;
        }
        System.out.println(Arrays.toString(listaAleatoria));
        
    }
    
}
