import java.util.Scanner;

public class whileMostrarPantallaDiezVeces {

        String palabra;
        public static void main(String[] args) {
            Scanner letras = new Scanner(System.in);
            Scanner numeros = new Scanner(System.in);
            String palabra;
            int contador = 0;


        System.out.println("Ingrese una palabra");
        palabra = letras.nextLine();
        while (contador < 10)  {
            contador = contador + 1; // esto es igual que contador++ o contador+=1
            // esto lo que significa es 0 = 0 + 1 entonces contador en la primera vuelta vale 1,
            // en la segunda ya seria 1 = 1 + 1 y esto hace que contador sea igual a 2 y asi hasta que se cumpla la condicion
            System.out.println("contando"+ contador );
            System.out.println("la palabra es: "+ palabra);
        }





    }
}
