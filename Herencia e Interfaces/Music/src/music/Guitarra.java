
package music;

public class Guitarra extends Instrumento implements Afinable{

    @Override
    public void Tocar() {
        System.out.println("Suena la cuerda");
    }

    @Override
    public void Afinar() {
        System.out.println("Afinar guitarra");
    }
    
}
