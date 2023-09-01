import java.util.Scanner;

public class Resta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //con este comando llamamos la funcion escaner que para poder pedir algo por teclado
         int primerNumero; //aqui creamos las variables que vamos a usar para nuestro programa
         int segundoNumero;

        System.out.println("Ingrese el primer numero"); //este es un mensaje para que el usuario sepa que poner
        primerNumero = entrada.nextInt ();//aqui usamos el escaner para pedirle al usuario que ingrese el dato que queremos

        System.out.println("Ingrese el segundo numero");
        segundoNumero = entrada.nextInt ();

        int reultadoResta = primerNumero - segundoNumero;
        System.out.println("Resultado de resta es:" + reultadoResta);







    }
}
