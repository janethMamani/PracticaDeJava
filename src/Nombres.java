import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Scanner entradaTexto = new Scanner (System.in);

        System.out.println("¿Cual es tu nombre?");
        String nombre = entrada.nextLine ();
        System.out.println("Tu nombre es: " +nombre);
        System.out.println("¿Cual es tu edad?");
        int edad = entrada.nextInt ();
        System.out.println("Tu edad es: " + edad);
        System.out.println("¿Cual es tu numero de telefono?");
        String telefono = entradaTexto.nextLine ();
        System.out.println("Tu numero de telefono es: " + telefono);


        System.out.println(" Ingrese el nombre que puede ser el ganador:");
         nombre = entrada.nextLine ();





    }
}
