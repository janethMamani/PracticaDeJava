import java.util.Scanner;

public class CiclosWhile {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int numero = 0;

        System.out.println("Ingrese un numero, al ingresar 1 se termina el programa");
         numero = numeros.nextInt();

         while(numero != 1) {
             System.out.println("Estoy dentro de while");
             System.out.println("Ingrese un numero, al ingresar 1 se termina el programa");
             numero = numeros.nextInt();
         }
        System.out.println("El programa ha terminado");






}}
