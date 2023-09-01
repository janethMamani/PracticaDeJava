import java.util.Scanner;

public class Objetos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre de un objeto:");
        String nombre= entrada.nextLine();

        if (nombre.equals("Frasco")) {
            System.out.println("Nombre de objeto ingresado");
        }
        //System.out.println("Ingrese el nombre de un objeto:");
        //nombre = entrada.nextLine();

        if (nombre.contains("a")) {
            System.out.println ("Su palabra tiene la letra ¨a¨");
        }
        else {
            System.out.println("Su palabra no tiene la letra ¨a¨");
        }

        //System.out.println("Ingrese el nombre de un objeto:");
        //nombre = entrada.nextLine();

        if (nombre.contains("o")) {
            System.out.println("Su palabra tiene la letra ¨o¨");
        }
        else {
            System.out.println("Su palabra no tiene la letra ¨o¨");
        }
        //System.out.println("Ingrese el nombre de un objeto");
        //nombre = entrada.nextLine();

        if (nombre.contains("Arma")) {
            System.out.println ("Reporte ese objeto a las autoridades");
        }




}}