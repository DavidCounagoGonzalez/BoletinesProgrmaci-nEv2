
package boletin21_3;

import Arrays.metodosArray;
import java.util.Arrays;
import javax.swing.JOptionPane;

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
    
    public static String[] listaAlumnos(String lista[]){
        for(int i=0;i<lista.length;i++){
           lista[i]=JOptionPane.showInputDialog("Teclea el nombre del alumno (en orden): ");
        }
        return lista;
    }
    
    public static void notaAlumno(String listaN[], int lista[]){
        String nombre=JOptionPane.showInputDialog("Introduce el nombre del alumno que desea ver su nota: ");
        int posicion;
        int enlista=0;
        for (int j=0;j<listaN.length;j++){
            if (nombre.equalsIgnoreCase(listaN[j])){
                posicion=j;
               int i=posicion;
                System.out.println("El alumno nº"+(posicion+1)+" es "+nombre+" y tiene un "+lista[j]);
                enlista=1;
                break;
                
            }
        }
        if (enlista==0){
            System.out.println("El alumno no se encuentra en la lista;");
        }
    }
    
    public static void aprobados(String listaN[],int lista[]){
        int j;
        for (int i=0;i<lista.length;i++){
            if (lista[i]>=5){
                j=i;
                System.out.println(listaN[j]+" está aprobad@ con un "+lista[i]);
            }
        }
    }
      
    public static void listaOrdenada(String listaN[], int lista[]){
       int auxiliar;
       String orden;
       int j;
    for (int i=0;i<lista.length-1;i++){
        for (int u=i+1;u<lista.length;u++){
            j=i;
            if (lista[i]>lista[u]){
                auxiliar=lista[i];
                lista[i]=lista[u];
                lista[u]=auxiliar; 
                orden=listaN[j];
                listaN[j]=listaN[u];
                listaN[u]=orden; 
        }
    }  
    }
   System.out.println(Arrays.toString(listaN));
        System.out.println(Arrays.toString(lista)); 
}
}
