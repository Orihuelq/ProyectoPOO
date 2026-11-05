import java.util.Scanner;

public class E_11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en Celsius: ");
        double temperatura = teclado.nextDouble();

        boolean congela = (temperatura <= 0);

        System.out.println("Esta en temperatura de congelacion: " + congela);
    }
}
