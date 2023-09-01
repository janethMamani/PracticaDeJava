import java.util.Scanner;

public class Practca {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = letras.nextLine();

        System.out.println("Ingrese su edad:");
        int edad = numeros.nextInt();

        System.out.println("Usted es casado?");
        String casado = letras.nextLine();

        System.out.println("¿Usted tiene hijos?");
        String hijos = letras.nextLine();

        if (hijos.equals("si"))
        {
            System.out.println("¿Cuantos hijos tiene?");
        }
    }
}

