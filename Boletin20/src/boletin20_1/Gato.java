
package boletin20_1;


public class Gato extends Mamíferos implements IPodeNadar {
    @Override
    public void camiña(){
        System.out.println("El gato camina");
    }
    @Override
    public void nada(){
        System.out.println("El gato nada");
    }
}
