import java.util.Scanner;

public class MarcaDeZapatillas {
    public static void main(String[] args) {
        Scanner letras = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);
        int descuentoForma3 = 0;
        int descuentoForma1 = 0;
        int descuentoForma2 = 0;
        int resultadoDelDescuento = 0;

        System.out.println("Ingrese marca de zapatilla");
        String marca = letras.nextLine();

        System.out.println("precio de zapatilla");
        int precio = numeros.nextInt();

        System.out.println("¿Cuantas zapatillas llevan?");
        int cuantas = numeros.nextInt();

        if(marca.equals("nike") || marca.equals("adidas")|| marca.equals("caperpile") && (cuantas>2)) {
            System.out.println("Tiene un 30% de descuento");
            // forma 1
            descuentoForma3 = (cuantas * precio) * 70 /100;

            // forma 2
            descuentoForma2 = (cuantas * precio) * 30 /100;
            resultadoDelDescuento = (cuantas * precio) - descuentoForma2;

            // forma 3
            descuentoForma1 = (int) ((cuantas * precio) * 0.7); // estamos mulptilicando cuantas por precio y despues lo multiplicamos por 0.7 para restarle un 30%

            System.out.println("La zapatilla con el 30% de descuento vale: "+descuentoForma1);

        }
        else  {
            System.out.println("El precio es:" + cuantas * precio);
        }
        //int resultadoMultiplicacion =  cuantas * precio;
       //  System.out.println("El precio sin el descuento es:"+ cuantas * precio);






    }
    }

