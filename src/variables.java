public class variables {
    public static void main(String[] args) {
        int pizzas = 6 ;
        int personas = 3;
        int pizzasPorPersonas = pizzas / personas;
        System.out.printf("si hay " + pizzas +" pizzas y %d personas, a cada una le tocan %d pizzas\n",
                pizzas, personas,pizzasPorPersonas);
        String auto = "Ferrari";
        double velocidad =90.3;
        System.out.printf("El auto %s se desplaza a %f km/h\n", auto, velocidad);
        int precioLeche = 14;
        double precioJamon = 35.6;
        int precioHuevo = 23;

        double precioTotal = precioLeche + precioJamon + precioHuevo;
       System.out.printf ("El precio total es: %f\n"+ precioTotal);
    }
}
