
package boletin21_2;

import java.util.Arrays;

public class notas {
    
    public static int[] listaNotas(int lista[]){
        for (int i=0;i<lista.length;i++){
            lista[i]= (int) (Math.random()*11);
            
    }
        System.out.println(Arrays.toString(lista));
        return lista;
    
}
    
    public static void calificación(int lista[]){
        int aprobados=0;
        int suspensos=0;
        for (int i=0;i<lista.length;i++){
            if (lista[i]>5){
                aprobados++;  
            }
            else{
                suspensos++;
            }
        }  
        System.out.println("Aprobados: "+aprobados+"\n Suspensos: "+suspensos);
    }
    
    public static void notaAlta(int lista[]){
        int masAlta=lista[0];
        for (int i=0;i<lista.length;i++){
            if (lista[i]>masAlta){
                masAlta=lista[i];
            }
            
        }
        System.out.println("La nota más alta fue: "+masAlta);
    }
            
}
