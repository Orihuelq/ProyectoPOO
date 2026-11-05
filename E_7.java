import java.util.Scanner;

public class E_7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la calificacion de examenes: ");
        double examenes = teclado.nextDouble();

        System.out.print("Ingresa la calificacion de tareas: ");
        double tareas = teclado.nextDouble();

        System.out.print("Ingresa la calificacion del proyecto: ");
        double proyecto = teclado.nextDouble();

        double promedio = (examenes * 0.40 + tareas * 0.30 + proyecto * 0.30);

        System.out.println("La calificacion final es: " + promedio);
    }
}
