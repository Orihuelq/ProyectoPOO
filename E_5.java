import java.util.Scanner;

public class E_5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa las horas trabajadas: ");
        double horas = teclado.nextDouble();

        System.out.print("Ingresa el pago por hora: ");
        double pagoHora = teclado.nextDouble();

        double sueldoBruto = (horas * pagoHora);
        double impuestos = (sueldoBruto * 0.12);
        double sueldoNeto = (sueldoBruto - impuestos - 150);

        System.out.println("El sueldo neto es: " + sueldoNeto);
    }
}
