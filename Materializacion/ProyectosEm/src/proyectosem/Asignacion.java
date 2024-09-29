
package proyectosem;

public class Asignacion {
    private Empleado empleado;
    private Proyecto proyecto;
    
    public Asignacion(Empleado empleado, Proyecto proyecto){
        this.empleado = empleado;
        this.proyecto = proyecto;
    }
    
    public void mostrarAsignacion(){
        System.out.println("El empleado " + empleado.getNombre() + " a sido asignado al proyecto " + proyecto.geNombre());
    }
}
