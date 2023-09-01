import java.util.Scanner;

public class contraseñaBloqueada {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);
        String clave;
        int contador = 0;

        System.out.println("Ingrese contraseña");
        clave = letras.nextLine();

        while (contador < 3 && !clave.equals("Dogy")) {
            contador = contador + 1;
            System.out.println("contando:" + contador);
            System.out.println("ingrese la contraseña nuevamente");
            clave = letras.nextLine();
        }

        if (contador == 3) {
            System.out.println("cuenta bloqueada");
        }
        else {
            System.out.println("contraseña correcta");
        }
    }
}