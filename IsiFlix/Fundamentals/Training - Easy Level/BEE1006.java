import java.util.Scanner;

public class BEE1006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Input
        double A, B, C, Media;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        // Process
        Media = (A * 2 + B * 3 + C * 5) / 10;

        // Output
        System.out.printf("MEDIA = %.1f\n", Media);

        teclado.close();
    }
}