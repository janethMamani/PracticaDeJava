import java.util.Scanner;

public class EjemploOrYAnd {
    public static void main(String[] args) {
        Scanner letras = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = letras.nextLine();
        System.out.println("Participo de la rifa: ");
        String rifa = letras.next();

        if(nombre.equals("Janeth") || nombre.equals("Juan")){ //or en java
            System.out.println("Felicidades usted es el ganador de la loteria");
        }

        if(nombre.contains("Janeth") && rifa.equals("si")){
            System.out.println("Felicidades usted es el ganador de la loteria");
        }

    }
}
