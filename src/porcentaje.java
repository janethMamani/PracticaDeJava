import java.util.Scanner;
public class porcentaje {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);
        int resultadoDescuento = 0;
        int porcentaje = 0;
        int opcion= 0;
        //int opcion2 =0;
        int primerNumero = 0;
        int segundoNumero = 0;
        int ResultadoSuma = 0;
        String nombre;
        int numeroDeDocumento=0;

        System.out.println("Elija una opcion para iniciar determinado programa");
        System.out.println("1) Sumar 2 numeros y restar porcentaje elegido");
        System.out.println("2) Ingrese su nombre y numero de document y estos se mostraran en la pantalla");
        System.out.println("3) Opcion no disponible, aun en construccion...");

        System.out.println("Elija una opcion");
        opcion = numeros.nextInt();

        if(opcion == 1){
            System.out.println("Ingreso a la opcion 1.");
            System.out.println("Ingrese el primer numero:");
            primerNumero  = numeros.nextInt();

            System.out.println("Ingrese el segundo numero:");
            segundoNumero  = numeros.nextInt();

            ResultadoSuma = primerNumero + segundoNumero ;
            System.out.println("El Resultado suma es: \n" + ResultadoSuma);


        System.out.println("Ingrese el porcentaje que se va a restar:");
        porcentaje = numeros.nextInt();

        System.out.println("El resultado es:"+ResultadoSuma * porcentaje /100);}

        if(opcion == 2){
            System.out.println("Ingreso a la opcion 2");
            System.out.println("Ingrese su nombre:");
            nombre= letras.nextLine ();
            System.out.println("Ingrese su numero de documento:");
            numeroDeDocumento  = numeros.nextInt();

            System.out.println("Su nombre es: " + nombre);
            System.out.println("Su numero de documento es: " + numeroDeDocumento);
        }



    }
}
