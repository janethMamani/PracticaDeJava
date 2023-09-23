import java.util.Scanner;

public class comprasSuper {
    public static void main(String[] args) {
        Scanner letras = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);
        int cantidadDeProductos = 0;
        String producto;

        System.out.println("cuantos productos se va ingresar: ");
        cantidadDeProductos = numeros.nextInt();

        for (int i = 0; i < cantidadDeProductos; i++) {
            System.out.println("Ingrese el producto: ");
            producto = letras.nextLine();

            if (producto.equals("leche") || producto.equals("arroz") || producto.equals("pan") || producto.equals("polenta")) {
                System.out.println("Este producto tiene un 15% de descuento.");
            }
        }


    }
}

