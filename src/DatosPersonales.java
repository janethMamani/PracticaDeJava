import java.util.Scanner;

public class DatosPersonales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaCasado = new Scanner(System.in);
        Scanner entradaHijos = new Scanner(System.in);
        int cuantos = 0;

        System.out.println("Ingrese su nombre:");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese su edad:");
        int edad = entrada.nextInt();

        System.out.println("Usted es casado?");
        String casado = entradaCasado.nextLine();

        System.out.println("¿Usted tiene hijos?");
        String hijos = entradaHijos.nextLine();

        if (hijos.equals("si"))
        {
            System.out.println("¿Cuantos hijos tiene?");
            cuantos = entradaHijos.nextInt();
        }
        if (hijos.equals("no"))
        {
            System.out.println("Usted no tiene hijos");
        }

        System.out.println("Los datos ingresados de la persona son:\nnombre: "+nombre+"\nEdad: "+edad+"\ncasado: "
                +casado+"\nhijos: "+hijos+"\ncuantos: "+cuantos);
    }




}