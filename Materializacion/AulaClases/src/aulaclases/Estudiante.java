
package aulaclases;

public class Estudiante {
    private Aula estudiante1;
    private Aula estudiante2;
    
    public Estudiante(Aula estudiante1, Aula estudiante2 ){
        this.estudiante1 = estudiante1;
        this.estudiante2 = estudiante2;
    }
    
    public void alAula(){
        estudiante1.agregar();
        estudiante2.agregar();
        
        System.out.println("estudiantes agregados");
    }
}
