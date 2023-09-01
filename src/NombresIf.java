import java.sql.SQLOutput;
import java.util.Scanner;

public class NombresIf {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre que puede ser el ganador:");
        String nombre = entrada.nextLine();

        if (nombre.equals("Jeremias")) { //Aca se fija que la palabra sea exactamente esta si no, no entra al if.
            System.out.println("felicidades usted ha sido el ganador");

            System.out.println("Ingrese el nombre que puede ser el ganador:");
        }   nombre = entrada.nextLine();

        if (nombre.contains("m")) { // esto se fija que dentro de la variable este esa letra o esa parte de una palabra
            System.out.println("felicidades usted ha sido el ganador 2");

        }
    }
}