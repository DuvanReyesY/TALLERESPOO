
package transportes;

// Clase Moto que sobrescribe mover
class Moto extends Vehiculo {

    @Override
    public void mover() {
        System.out.println("La moto se mueve rápidamente.");
    }

}