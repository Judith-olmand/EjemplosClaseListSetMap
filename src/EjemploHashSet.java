import java.util.Set;
import java.util.HashSet;

public class EjemploHashSet {
    public static void main(String[] args) {
    // Creación de un HashSet
        Set<String> conjunto = new HashSet<>();
        // Agregar elementos
        conjunto.add("Elemento A");
        conjunto.add("Elemento B");
        conjunto.add("Elemento A"); // No se añadirá (duplicado)
        // Eliminar un elemento
        conjunto.remove("Elemento A");
        // Recorrer el conjunto
        for (String elemento : conjunto) {
            System.out.println(elemento);
        }
    }
}
