package boletin21_3;


public class Boletin21_3 {

   
    public static void main(String[] args) {
        int lista[]=new int[6];
        String alumnos[]=new String[6];
        
        notas.listaNotas(lista);
        notas.calificación(lista);
        notas.notaAlta(lista);
        notas.listaAlumnos(alumnos);
        notas.notaAlumno(alumnos, lista);
        notas.aprobados(alumnos, lista);
        notas.listaOrdenada(alumnos, lista);
    }
    
}
