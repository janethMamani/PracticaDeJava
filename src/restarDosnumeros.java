import java.util.Scanner;

public class restarDosnumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primerNumero;
        int segundoNumero;
        int resultado;

        System.out.println("Ingrese el primer numero");
        primerNumero = entrada.nextInt();

        System.out.println("Ingrese el segundo numero");
        segundoNumero = entrada.nextInt();

        resultado = primerNumero - segundoNumero;
        //System.out.println("El resultado es: "+ resultado);

        if ( resultado== 0) {
            System.out.println("El resultado de la resta da:"+ resultado);
        }
        else {
            System.out.println("El resultado es: "+ resultado);

        }



    }
}
