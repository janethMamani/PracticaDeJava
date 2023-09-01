import java.util.Scanner;

public class comidaPerroyGato {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);
        String nombre;
        int kilos = 0;
        int precio = 1000;
        int precio2 = 800;

        System.out.println("Elija el alimento que va a comprar:");
        System.out.println("Comida para perro");
        System.out.println("Comida para gato");
        nombre = letras.nextLine();

        if (nombre.equals ("perro")) {
            System.out.println("¿Cuantos kilos va a llevar?");
            kilos = numeros.nextInt();
            System.out.println("El precio es:"+ kilos * precio);
        }
        if (nombre.equals ("gato")) {
            System.out.println("¿Cuantos kilos va a llevar?");
            kilos = numeros.nextInt();
            System.out.println("El precio es:"+ kilos * precio2);
        }
}
}