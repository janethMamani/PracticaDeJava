import java.util.Scanner;

public class mostrarNumerosEnteros {

    public static void main(String[] args) {
        Scanner letras = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);
        //int cantidad = 0;
        int numero = 0;
        //int numero3 =0;
        int contador = 0;
        int sumador = 0;
        int total = 0;

            System.out.println("Ingrese un numero para sumar, si ingresa el 0 finaliza el programa");
            numero = numeros.nextInt();
            while (numero != 0) {
                contador = contador + 1;
                System.out.println("sumando, ingresa 0 finaliza el ingreso");
                numero = numeros.nextInt();
                // System.out.println("ingrese nuevamente un numero");
                // numero3 = numeros.nextInt();

               sumador += numero;
            }
            total = sumador;

            System.out.println("el total es:" + total);








    }
}
