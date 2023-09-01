import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primerNumero;
        int segundoNumero;

        System.out.println("Ingrese el primer numero") ;
        primerNumero = entrada.nextInt();

        System.out.println("Ingrese el segundo numero");
        segundoNumero = entrada.nextInt ();

        int ResultadoSuma = primerNumero + segundoNumero;
        System.out.println("Resultado de suma es:" + ResultadoSuma);



    }
}
