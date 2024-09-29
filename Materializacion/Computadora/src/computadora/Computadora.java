
package computadora;

public class Computadora {

    private Procesador procesador;
    
    public Computadora( Procesador procesador){
        this.procesador= new Procesador();
    }
    
    public void generar(){
        procesador.crear();
        
        System.out.println("El procesador esta siendo creado");
     
    }
    
    public void destruir(){
        procesador.eliminar();
        
        System.out.println("El procesador se destruyo");
    }
    
}
