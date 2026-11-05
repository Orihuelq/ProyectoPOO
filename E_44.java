import java.util.Scanner;

public class E_44 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa x: ");
        double x = teclado.nextDouble();

        System.out.print("Ingresa y: ");
        double y = teclado.nextDouble();

        boolean primerCuadrante = ((x > 0) && (y > 0));

        System.out.println("Esta en el primer cuadrante: " + primerCuadrante);
    }
}
