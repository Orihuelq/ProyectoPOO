import java.util.Scanner;

public class E_29 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la presion sistolica: ");
        int presion = teclado.nextInt();

        boolean normal = ((presion >= 90) && (presion <= 120));

        System.out.println("Esta en el rango indicado: " + normal);
    }
}
