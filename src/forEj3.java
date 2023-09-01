import java.sql.SQLOutput;
import java.util.Scanner;

public class forEj3 {
    public static void main(String[] args) {
        Scanner letras = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);
        int opcion = 0;
        int cantidad = 0;
        int i = 0;
        String nombres;
        String sumador = "";
        String contraseña;

        while (opcion != 3) {


            System.out.println("Ingrese una opcion");
            System.out.println("1)Se pide ingresar 3 nombres y mostrarlo al final");
            System.out.println("2)Se pide ingresar una contraseña la cual es (Peluche),si se ingresa mal 3 veces debe aparecer el mensaje (cuenta bloqueada)");
            System.out.println("3)Salir");
            opcion = numeros.nextInt();

            if (opcion == 1) {
                System.out.println("Ingreso a la opcion 1");
                System.out.println("Ingrese la cantidad de nombres que va a ingresar:");
                cantidad = numeros.nextInt();
                for (i = 0; i < cantidad; i = i + 1) {
                    nombres = letras.nextLine();
                    sumador += nombres;
                    sumador += " ";
                }
                System.out.println("Los nombres ingresados son: " + sumador);
            }
            if (opcion == 2) {
                System.out.println("Usted ingreso a la opcion 2");
                System.out.println("Ingrese la contraseña");
                contraseña = letras.nextLine();
                for (i = 0; i < 3 && !contraseña.equals("peluche"); i++) {
                    System.out.println("Ingrese la contraseña");
                    contraseña = letras.nextLine();
                }
                if (i == 3) {
                    System.out.println("La contraseña fue bloqueada");
                }
            }
           // if (opcion == 3) {
                // System.out.println("el programa finalizo");

            //}


        }
    }
}



