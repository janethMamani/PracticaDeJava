import java.util.Scanner;

public class menuEquivalencia {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);
        int opcion = 0;
        int dolarIngresado = 0;
        int dolarBlue = 486;
        String nombreAlumno;
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int promedio = 3;
        int total = 0;

        System.out.println("Elija una opcion:");
        System.out.println("1) Equivalencia del dolar blue a pesos");
        System.out.println("2) Sacar el promedio de un alumno");
        System.out.println("3) Opcion no disponible aun");
        System.out.println("4) Salir");

        opcion = numeros.nextInt();
        if (opcion == 1) {
            System.out.println("Ud ingreso la opcion 1");
            System.out.println("Ingrese el monto de los dolares a transformar a pesos");
            dolarIngresado = numeros.nextInt();
            System.out.println("El equivalente en pesos es:" + dolarIngresado * dolarBlue);
        }

        if (opcion == 2) {
            System.out.println("Ud ingreso la opcion 2");
            System.out.println("Ingrese el nombre del alumno");
            nombreAlumno = letras.nextLine();
            System.out.println("ingresa la primera nota de 3 notas");
            nota1 = numeros.nextInt();
            System.out.println("Ingresa la segunda nota");
            nota2 = numeros.nextInt();
            System.out.println("Ingresa la tercera nota");
            nota3 = numeros.nextInt();
            total = (nota1 + nota2 + nota3) / promedio;
            System.out.println("El total es:" + total);

            if (total > 5) {
                System.out.println("Usted aprobo la materia");
            }
            else {
                System.out.println("Usted no aprobo la materia");
            }
        }
        if (opcion ==4) {
            System.out.println("Muchas gracias por usar nuestro programa, nos vemos!");
        }
    }
}