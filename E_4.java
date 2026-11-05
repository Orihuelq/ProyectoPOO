import java.util.Scanner;

public class E_4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el tiempo en segundos: ");
        double tiempo = teclado.nextDouble();

        double distancia = (0.5 * 9.81 * tiempo * tiempo);

        System.out.println("La distancia recorrida es: " + distancia);
    }
}
