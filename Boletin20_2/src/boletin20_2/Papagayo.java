
package boletin20_2;


public class Papagayo extends Aves implements IPodeVoar {
    @Override
    public void camiña(){
        System.out.println("El papagayo camina");
    }
    @Override
    public void voa(){
        System.out.println("El papagayo vuela");
    }
}
