import java.util.ArrayList;
import java.util.Scanner;
public class EjemploArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        // Creación de un ArrayList de tipo String
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar elementos
        nombres.add("A");
        nombres.add("B");
        nombres.add("C");
        nombres.add("A"); // Se permite un duplicado

        // Eliminar un elemento
        nombres.remove("Ana"); // Elimina la primera ocurrencia de "Ana"

        System.out.println("Letra a buscar");
        String letra = sc.nextLine();
        
        // Recorrer la lista con un for-each
        for (String nombre : nombres) {
            System.out.println(nombre);
            if (nombre.equalsIgnoreCase(letra)){
                contador++;
            }
        }
        System.out.println("De la letra " + letra + " hay " + contador + " iguales.");


        contador = 0;
        for (int i = 0; i < nombres.size(); i ++){
            if(nombres.get(i).equals(letra)){
                contador++;
            }
        }

        System.out.println("De la letra " + letra + " hay " + contador + " iguales.");


    }
}
