
package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    
    private List<Libro> libros = new ArrayList();
    
    public void añadir(Libro libro){
        libros.add(libro);    
    }
    
    public void mostrarLibros(){
        for(Libro libro: libros){
            System.out.println(libro.getNombre());
        }
    }
    public static void main (String[] args){
       
    }
}
