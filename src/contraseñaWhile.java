import java.util.Scanner;

public class contraseñaWhile {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner (System.in);
        String clave;


        System.out.println("Ingrese la clave");
        clave = letras.nextLine();

        while(!clave.equals("Dogy") && !clave.equals("Peluche")
        ) {
            System.out.println("Error clave incorrecta, Ingrese la clave");
            clave = letras.nextLine();
        }
        System.out.println("Felicidades, ingreso al sistema");




    }
}
