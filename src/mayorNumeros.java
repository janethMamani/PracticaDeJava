import java.util.Scanner;

public class mayorNumeros {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;

        System.out.println("Ingrese un numero");
        numero1 = numeros.nextInt();

        System.out.println("Ingrese el segundo numero");
        numero2 = numeros.nextInt();

        System.out.println("Ingrese el tercer numero");
        numero3 = numeros.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El mayor es:" + numero1);
        }
            if (numero2 > numero1 && numero2 > numero3) {
                System.out.println("El mayor es:"+numero2);
            }
            if (numero3 > numero1 && numero3 > numero2) {
                System.out.println("El mayor es:"+numero3);
            }
        }
    }
