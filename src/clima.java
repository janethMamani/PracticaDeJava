import java.util.Scanner;

public class clima {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);
        String clima;
        int grados = 0;

        System.out.println("¿Como esta el dia?");
        clima = letras.nextLine();
        if (clima.equals("soleado") || clima.equals("lloviendo") || clima.equals("nublado") || clima.equals("frio")) {
            System.out.println("¿Cuantos grados hace?");
            grados = numeros.nextInt();
            if (grados < 25 && clima.equals("soleado")) {
                System.out.println("Es un dia soleado pero no lo suficiente para ir a la pileta");
            }
            if (grados < 20 && clima.equals("lloviendo")) {
                System.out.println("Es un dia perfecto para ver peliculas y quedarse en casa, si sale por favor lleve paraguas");
            }
            if (grados > 25 && clima.equals("nublado")) {
                System.out.println("Esta nublado y hace calor,lleve un paraguas porque posiblemente va a llover");
            }
            if (grados < 15 && clima.equals("frio")) {
                System.out.println("Esta helado");

            }
        }
    }
    /*
    System.out.println("¿Como esta el dia?");
    clima = letras.nextLine();
    System.out.println("¿Cuantos grados hace?");
    grados = numeros.nextInt();
        if (grados < 25 && clima.equals("soleado")) {
            System.out.println("Es un dia soleado pero no lo suficiente para ir a la pileta");
        }
        if (grados < 20 && clima.equals("lloviendo")) {
            System.out.println("Es un dia perfecto para ver peliculas y quedarse en casa, si sale por favor lleve paraguas");
        }
        if (grados > 25 && clima.equals("nublado")) {
            System.out.println("Esta nublado y hace calor,lleve un paraguas porque posiblemente va a llover");
        }
        if (grados < 15 && clima.equals("frio")) {
            System.out.println("Esta helado");

        }
    }
    */
}