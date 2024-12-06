import java.util.Scanner;

public class BEE1016 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int distKm = teclado.nextInt(), tempoTotal = distKm * 2;

        System.out.printf("%d minutos\n", tempoTotal);

        teclado.close();

    }
}