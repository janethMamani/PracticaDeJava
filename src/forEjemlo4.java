import java.util.Scanner;

public class forEjemlo4 {
    public static void main(String[] args) {
        Scanner letras = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);
        String sumador = "";
        String letra="";

        System.out.println("ingrese la palabra letra por letra");
        while (!letra.equals("0")) {
            letra = letras.nextLine();
            System.out.println("Ingrese la letra");
            sumador += letra;
            if (letra.equals("s")) {
                System.out.println("felicidades, es el ganador del premio");
            }
        }
            System.out.println("El total de letras es: " + sumador);
    }
    }


           //System.out.println("El total de letras es" + sumador);



