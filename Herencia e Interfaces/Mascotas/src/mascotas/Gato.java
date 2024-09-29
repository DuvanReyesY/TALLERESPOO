
package mascotas;


public class Gato extends Animal{

    public Gato(){
        super.sonido="El gato maulla";
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
          
}
