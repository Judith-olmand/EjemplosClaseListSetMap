import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*realizar un programa en Java que genere 100 numeros aleatorios
del 1 al 49, les guarde en un ArrayList y después responda a estas preguntas
Cual es el numero mayor, el menor, la suma total de todos
Si hay algun numero mayor que 30
Cuantos numeros hay mayores de 45??? */

public class ListaAleatorio {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        List<Integer> numeros = new ArrayList<>();
        int numMayor = 0;
        int numMenor = 49;
        boolean comprobacion = false;
        int contador = 0;
        int suma = 0;

        for(int i = 0; numeros.size() < 100; i++){
            numeros.add(aleatorio.nextInt(48)+1);
        }

        for(int numero : numeros){
            System.out.print(numero + " ");
        }
        System.out.println();

        System.out.println("-----------NÚMERO MAYOR-------------");
        for(int numero : numeros){
            if (numero > numMayor ) {
                numMayor = numero;
            }
        }
        System.out.println("El número mayor es " + numMayor);


        System.out.println("------------NÚMERO MENOR------------");
        for(int numero : numeros){
            if (numero < numMenor ) {
                numMenor = numero;
            }
        }
        System.out.println("El número mayor es " + numMenor);

        System.out.println("------------SUMA TOTAL------------");
        for(int numero : numeros){
                suma =  suma+numero;
        }
        System.out.println("La suma de los numeros es " + suma);

        System.out.println("-----------NÚMEROS MAYORES QUE 30-------------");
        for(int numero : numeros){
            if (numero > 30 ) {
                comprobacion = true;
                contador++;
            }
        }
        if (comprobacion) {
            System.out.println("Si que hay números mayores que 30");
        } else {
            System.out.println("No hay números mayores que 30");
        }
        if (contador == 1) {
            System.out.println("Hay " + contador + " número mayor que 30.");
        } else {
            System.out.println("Hay " + contador + " números mayores que 30.");
        }

        contador = 0;
        System.out.println("-----------NÚMEROS MENORES QUE 45-------------");
        for(int numero : numeros){
            if (numero < 45 ) {
                contador++;
            }
        }
        if (contador == 1) {
            System.out.println("Hay " + contador + " número menor que 45.");
        } else {
            System.out.println("Hay " + contador + " números menores que 45.");
        }
        


    }
    


}
