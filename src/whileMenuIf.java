import java.util.Scanner;

public class whileMenuIf {


    public static void main(String[] args) {

        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);
        int opcion = 0;
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int promedio = 3;

        System.out.println("Elija una opcion:");

        System.out.println("1) Ingresar la cantidad de numeros a cargar y cuando se termine sacar el promedio");
        System.out.println("2) Pedir el nombre de una persona y mostrarla por pantalla");
        System.out.println("3) Aun sin definir");
        System.out.println("4) Salir");
        opcion = numeros.nextInt();

        if (opcion == 1) {
            System.out.println("Usted ingreso a la opcion 1");
            System.out.println("Ingrese el primer numero");
            numero1 = numeros.nextInt();
            System.out.println("Ingrese el segundo numero");
            numero2 = numeros.nextInt();
            System.out.println("Ingrese el tercer numero");
            numero3 = numeros.nextInt();

        }
    }
}