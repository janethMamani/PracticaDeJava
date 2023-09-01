import java.util.Scanner;

public class forEj2 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner (System.in);
        int numero = 0;

        System.out.println("Ingrese un numero para contar");
        numero = numeros.nextInt();
        //numero++;

        for (int i = 1; i <= numero; i=i+1){
            // En este ejercicio pediamos que la persona ingrese un numero e ibamos a contar desde 1 hasta el numero
            // ingresado, pero antes al for lo teniamos con i < numero, con esto no mostraba el ultimo numero
            // porque si ingresabamos por ejemplo un 5, 5 no es menor a 5, entonces saltaba el ultimo numero
            // lo solucionamos agregando <= (menor o igual) entonces 5 no es menor a 5 pero es igual y se cumple

            System.out.println("contando" +i);
        }



    }
}
