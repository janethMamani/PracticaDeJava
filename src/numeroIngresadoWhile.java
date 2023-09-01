import java.util.Scanner;

public class numeroIngresadoWhile {

  public static void main(String[] args) {
      Scanner numeros = new Scanner(System.in);
      Scanner letras = new Scanner(System.in);
      int numero = 0;
      int contador = 0;

      System.out.println("Ingrese un numero");
      numero = numeros.nextInt();

      while (contador < numero) {
          contador = contador + 1;
          System.out.println("contando: "+ contador);

      }
      //while (contador <= numero) {
          //contador = contador + 1;
         // System.out.println("contando: "+ contador);
      }


  }
