import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primerNumero;
        int segundoNumero;

        System.out.println("Ingrese el primer numero");
        primerNumero = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        segundoNumero = entrada.nextInt();

        int resultadoMultiplicacion = primerNumero * segundoNumero;
        System.out.println("El resultado es:\n" + resultadoMultiplicacion);

        System.out.println("+");
        primerNumero = entrada.nextInt();
        System.out.println("-");
        int resultadoSumaConResultado = primerNumero + resultadoMultiplicacion;
        System.out.println(resultadoSumaConResultado);

        //System.out.println("Ingrese el primer numero");
        //primerNumero = entrada.nextInt();
        //System.out.println("Ingrese el segundo numero");
        ////segundoNumero = entrada.nextInt();

        //int resultadoSuma = primerNumero + segundoNumero;
        //System.out.println("El resultado es:" + resultadoSuma  );






    }
}
