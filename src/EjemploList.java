import java.util.ArrayList;
import java.util.List;

public class EjemploList {
    public static void main(String[] args) {

        // Creación de una lista
        List<String> lista = new ArrayList<>();
        //List es la interfaz
        //ArrayList es la clase

        // Adición de elementos
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        
        // Eliminación de un elemento
        lista.remove("Elemento 1"); // También puede usarse lista.remove(0) 
                                      // para eliminar por índice
        lista.add("Elemento 3"); //permite duplicados
        lista.add(1,"Elemento 0"); //Añado un elemneto en una posicion especifica
        
        // Recorrido con bucle for-each
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        System.out.println("---------------------------------");

        for (int i = 0; i < lista.size(); i ++){
            System.out.println("En la posición "+ i + " se encuentra el " + lista.get(i));
        }
        System.out.println("---------------------------------");


        System.out.println("En la posición 0 se encuentra el " + lista.get(0));
        System.out.println("---------------------------------");

        for (int i = 0; i < lista.size(); i ++){
            System.out.println("¿La lista contiene el Elemento "+ i + "?:" + lista.contains("Elemento " + i));
        }
        System.out.println("---------------------------------");


        System.out.println("La lista tiene  " +lista.size() + " elementos");
        
        System.out.println("Borro el Elemento 3, solo se borra el primero de la lista, si hubiera más.");
        lista.remove("Elemento 3");
        System.out.println("La lista tiene  " +lista.size() + " elementos");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        System.out.println("---------------------------------");

        for (int i = 0; i < lista.size(); i ++){
            System.out.println("En la posición "+ i + " se encuentra el " + lista.get(i));
        }
        System.out.println("---------------------------------");
        
        System.out.println("Elimino todo");
        lista.removeAll(lista);
        System.out.println("La lista tiene  " +lista.size() + " elementos");
    }
}
