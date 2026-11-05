import java.util.Scanner;

public class E_8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa los kilometros recorridos: ");
        double kilometros = teclado.nextDouble();

        System.out.print("Ingresa los litros consumidos: ");
        double litros = teclado.nextDouble();

        double rendimiento = (kilometros / litros);

        System.out.println("El rendimiento en km por litro es: " + rendimiento);
    }
}
