public class ejemploStringSuma {
    public static void main(String[] args){
        String primerNumero = "1";
        String segundoNumero = "2";
        String resultado;

        resultado = primerNumero + segundoNumero;

        System.out.println("Resultado: "+primerNumero+segundoNumero);
        //aca no esta sumando, aca esta mostrandoel valor de cada variable nomas

        System.out.println("Resultado: "+(primerNumero+segundoNumero));
        // aca al agregarle () la computadora entiende que es una operacion matematica

    }
}
