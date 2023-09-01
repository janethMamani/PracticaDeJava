import java.util.Scanner;

public class ifIniciarPrograma {
    public static void main(String[] args) {
        Scanner letras = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);
        String opcion ;
        int numero1 = 0;
        int numero2 = 0;
        int total = 0;

        System.out.println("Desea iniciar el programa?(si o no)");
                opcion = letras.nextLine();

                if (opcion.equals("si")){
                    System.out.println("ingrese el primer numero a sumar");
                    numero1 = numeros.nextInt();
                    System.out.println("ingrese el segundo nro.");
                    numero2 = numeros.nextInt();
                    total = numero1+numero2;
                    System.out.println("El resultado es:"+ total);
                }
                 else {
                     System.out.println("Cerraando programa");
                 }

        }
}
