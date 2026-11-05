import java.util.Scanner;

public class E_27 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la edad: ");
        int edad = teclado.nextInt();

        System.out.print("Tiene pase VIP? (1 si, 0 no): ");
        int vip = teclado.nextInt();

        boolean preferencial = ((edad < 12) || (vip == 1));

        System.out.println("Tiene acceso preferencial: " + preferencial);
    }
}
