import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Definir constantes descuento 1 y 2
        final int descuento1 = 25;
        final int descuento2 = 50;

        // Declarar variables importe inicial, descontado y final como números reales
        // Declarar variable numPiezas como entero (no podemos tener media camiseta)
        float importeInicial, importeFinal, importeDescontado;

        int numPiezas;

        // importeinicial = leerTeclado()
        // num piezas = leerTeclado()
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Introduce el importe inicial: ");

        importeInicial = sc.nextFloat();  // Read user input

        System.out.println("Introduce el número de piezas: ");

        numPiezas = sc.nextInt();  // Read user input

        // condicionales y calculo de precios

        if (numPiezas <= 3) {
            importeDescontado = importeInicial * descuento1/100;
        } else {
            importeDescontado = importeInicial * descuento2/100;
        }


        importeFinal = importeInicial - importeDescontado;

        System.out.println("El importe final es: " + importeFinal);

}
}
