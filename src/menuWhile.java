import java.util.Scanner;

public class menuWhile {
    public static void main(String[] args) {

        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);

        int opcion = 0;
        int cantidadDeNumeros = 0;
        int sumador = 0;
        int numeroASumar = 0;
        int promedio = 3;
        int resultado = 0;
        int contador = 0;

        while (opcion!=4) {
            System.out.println("Elija una opcion:");

            System.out.println("1) Ingresar la cantidad de numeros a cargar y cuando se termine sacar el promedio");
            System.out.println("2) Pedir el nombre de una persona y mostrarla por pantalla");
            System.out.println("3) Aun sin definir");
            System.out.println("4) Salir");
            opcion = numeros.nextInt();


            if (opcion == 1) {
                System.out.println("Usted ingreso a la opcion 1");

                System.out.println("Ingrese la cantidad de numeros a ingresar");
                cantidadDeNumeros = numeros.nextInt();
                while (contador < cantidadDeNumeros) {
                    contador = contador + 1;

                    System.out.println("Ingrese el numero para ir sumando y sacar el promedio al final del ingreso");
                    numeroASumar = numeros.nextInt();
                    sumador += numeroASumar;
                }

                resultado = sumador / promedio;
                System.out.println("El resultado es:" + resultado);

            }

            if (opcion == 2) {
                System.out.println("Usted ingreso a la opcion 2");
                System.out.println("Ingrese su nombre");
                String nombre = letras.nextLine();
                System.out.println("Su nombre es: " + nombre);
            }
            if (opcion == 3) {
                System.out.println(" Aun sin definir");
            }

            if (opcion == 4) {
                System.out.println("El programa ha finalizado");
            }
        }


    }
}

