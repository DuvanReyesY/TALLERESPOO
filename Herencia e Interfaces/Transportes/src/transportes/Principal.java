
package transportes;

public class Principal {
    public static void main(String []args){
        Vehiculo v = new Moto(); //Polimorfismo
        v.mover();
              
        System.out.println("");
        
        Vehiculo A = new Avion();
        A.mover();
    }
}
