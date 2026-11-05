import java.util.Scanner;

public class E_49 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el promedio academico: ");
        double promedio = teclado.nextDouble();

        System.out.print("Ingresa el ingreso familiar mensual: ");
        double ingreso = teclado.nextDouble();

        System.out.print("Ingresa el numero de hermanos estudiantes: ");
        int hermanos = teclado.nextInt();

        boolean beca = ((promedio >= 9.5) || ((ingreso < 8000) && (hermanos > 2)));

        System.out.println("Cumple con los criterios de beca: " + beca);
    }
}
