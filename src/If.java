import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroOculto = 250;


        System.out.println("Ingrese el numero que puee ser el ganador:");
        int numeroIngresado = entrada.nextInt();

        if(numeroIngresado == 250) {
            System.out.println("felicidades usted ha sido el ganador");
        }
        else {//sino se cumple la condicion del if se ejecuta el else
            System.out.println("usted no es el ganador");

        }


}
}
