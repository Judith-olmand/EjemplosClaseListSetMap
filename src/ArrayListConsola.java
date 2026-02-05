import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListConsola {
   
    public static void main(String[] args) {
        boolean salir = false; //Variable para el bucle

        // Creación de un ArrayList de tipo String
        ArrayList<String> nombres = new ArrayList<>();
        
        //Bucle para solicitar nombres por teclado
        while (!salir) {
            System.out.println("Escribe el nombre que quiere agregar a la lista.");
            System.out.println("Si quiere salir escriba 'Salir'");
            Scanner sc = new Scanner(System.in);
            String texto = sc.nextLine();
            if (texto.equals("Salir")) {
                salir=true;
            } else if (texto.equalsIgnoreCase("salir")) {
                System.out.println();
                System.out.println("ESE " + texto + " NO ES VÁLIDO PARA SALIR.");
                System.out.println();
            } else {
                nombres.add(texto);
            }
        }
        
        System.out.println("-------------------------");
        System.out.println("LA LISTA TIENE  " + nombres.size() + " NOMBRES.");
        // Recorrer la lista con un for-each
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println("------------------------");
        for (int i = 0; i < nombres.size(); i ++){
            System.out.println("En la posición "+ i + " se encuentra el nombre de " + nombres.get(i));
        }

        
    }
}