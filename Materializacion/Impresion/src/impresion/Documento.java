
package impresion;

public class Documento {
    
    public void sacarCopia(){
        Impresora impre = new Impresora();
        impre.imprimir();
        System.out.println("Imprimiendo...");
    }
    
    
}
