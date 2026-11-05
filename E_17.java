import java.util.Scanner;

public class E_17 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la velocidad en km/h: ");
        double velocidad = teclado.nextDouble();

        boolean excede = (velocidad > 110.0);

        System.out.println("Excede el limite: " + excede);
    }
}
