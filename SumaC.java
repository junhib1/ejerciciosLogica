import java.util.Scanner;

public class SumaC {
    int a, b;

    SumaC() {
        System.out.println("SE ESTA CONSTRUYENDO LA SUMA");
    }

    public void sumarA() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        a = scanner.nextInt();
    }

    public void sumarB() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el segundo numero: ");
        b = scanner.nextInt();
    }

    public void mostrarResultado() {
        System.out.println("El resultado es: " + (a + b));
    }
}