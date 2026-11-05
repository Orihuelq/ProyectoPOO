import java.util.Scanner;

public class E_21 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        double x = teclado.nextDouble();

        boolean dentro = ((x > 15) && (x < 85));

        System.out.println("Esta entre 15 y 85 sin incluirlos: " + dentro);
    }
}
