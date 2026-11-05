import java.util.Scanner;

public class E_46 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el dia: ");
        int dia = teclado.nextInt();

        System.out.print("Ingresa el mes: ");
        int mes = teclado.nextInt();

        boolean valida = ((mes >= 1) && (mes <= 12) && (dia >= 1) && (dia <= 31));

        System.out.println("La fecha es valida en el rango general: " + valida);
    }
}
