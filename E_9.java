import java.util.Scanner;

public class E_9 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el total de horas: ");
        int horas = teclado.nextInt();

        int dias = (horas / 24);
        int sobrantes = (horas % 24);

        System.out.println("Dias completos: " + dias);
        System.out.println("Horas sobrantes: " + sobrantes);
    }
}
