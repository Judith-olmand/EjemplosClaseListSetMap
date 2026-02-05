import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetAleatorio {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        /* Set<Integer> numeros = new HashSet<>();
        Set<Integer> numPremiado = new HashSet<>(); //HashSet no guarda numeros repetidos

        //Creo un HashSet para los 1000 numeros participantes
        for(int i = 1; numeros.size() < 1000; i++){
            numeros.add(i);
        }

        for(int numero : numeros){
            System.out.print(numero + " ");
        }

        System.out.println();
        System.out.println("Hay un total de " + numeros.size() + " numeros");
        System.out.println("--------------------------------");


        //Creo un HashSet para los 100 numeros premiados aleatorios
        for(int i = 0; numPremiado.size() < 100; i++){
            numPremiado.add(aleatorio.nextInt(999)+1);
        }

        System.out.println();
        System.out.println("Hay " + numPremiado.size() + " numeros premiados.");
        System.out.println("-----------------------------");
        System.out.println("Los números ganadores son: ");

        //Recorro los 2 HashSet y los comparo para mostrar los ganadores en orden.
        for(int numero : numeros){
            for(int premiado : numPremiado){
                if(numero == premiado){
                    System.out.print(numero + ", ");
                }
            }
        }*/

        Set<Integer> conjunto = new HashSet<>();
        while (conjunto.size()<100){
            conjunto.add(aleatorio.nextInt(999)+1);
        }

        System.out.println("Los números premiados son: ");

        for(int numerosss : conjunto){
            System.out.print(numerosss + ", ");
        }

    

    }
}
