import java.util.Scanner;

public class whileCuantasLetrasTieneLaPalabra {
    public static void main(String[] args) {
        Scanner letras = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);
        int cantidadDeLetras = 0;
        int contador = 0;
        String Letras;
        String sumador = "";
        String totalLetras = null;

        System.out.println("Ingrese la cantidad de letras de la palabra");
        cantidadDeLetras = numeros.nextInt();

        while (contador<cantidadDeLetras){
            contador = contador +1;
            if (contador == 3) {
                System.out.println("Esta ingresando la 3ra letra pato,pato");
            }
            else {
                System.out.println("ingrese letra " + contador);
            }
            Letras = letras.nextLine();
           sumador+= Letras; // esto es igual que sumador = sumador + Letras  y sumador+= Letras
           totalLetras = sumador;
        }
        System.out.println("La palabra es: " + totalLetras);

    }
}