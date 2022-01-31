
package boletin20_2;

public class Morcego extends Mamíferos implements IPodeVoar {
    @Override
    public void camiña(){
        System.out.println("El murciélago camina.");
    }
    @Override
    public void voa (){
        System.out.println("El murciélago vuela.");
    }
}
