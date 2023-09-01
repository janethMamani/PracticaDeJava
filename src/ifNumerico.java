import java.util.Scanner;

public class ifNumerico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaTexto = new Scanner(System.in);

        System.out.println("1) Es escribir nombre y mostrarlo.");
        System.out.println("2) Ingresar un numero, multiplicarlo por 2 y mostrar el resultado.");
        System.out.println("3) Que pida ingresar el efectivo que quiera extraer.");
        System.out.println("Escribir opcion a elegir: ");
        int numeroIngresado = entrada.nextInt();

        if (numeroIngresado == 1) {
            System.out.println("Usted ingresó la opción 1");
            System.out.println("Ingrese su nombre:");
            String nombre = entradaTexto.nextLine();
            System.out.println("Nombre ingresado: "+nombre);
        }
        if (numeroIngresado == 2) {
            System.out.println("Usted ingresó la opción 2");

            int primerNumero;
            int segundoNumero = 2;
            int resultado;
            System.out.println("Ingrese numero:");
            numeroIngresado = entrada.nextInt();
            System.out.println("Resultado: " + numeroIngresado * segundoNumero);
        }

        if (numeroIngresado == 3) {
            System.out.println("Usted ingresó la opción 3");

            System.out.println("Ingrese monto a extraer");
            numeroIngresado = entrada.nextInt();
        }

    }



}
