import java.util.Scanner;

public class forEj1 {
    public static void main(String[] args) {

        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner (System.in);
        String contraseña;
        int contador = 0;

        System.out.println("Ingrese la contraseña");
        contraseña = letras.nextLine();

       // while(contador < 3 && !contraseña.equals("dogy")){
          //  contador++;
        for(int i=0; i < 3 && !contraseña.equals("dogy");i++){
            System.out.println("Ingrese la contraseña");
            contraseña = letras.nextLine();
        }


    }
}