import java.util.Scanner;

public class BEE1014 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int X = teclado.nextInt();
        double Y = teclado.nextDouble(), resultadoFinal;

        resultadoFinal = X / Y;

        System.out.printf("%.3f km/l\n", resultadoFinal);

        teclado.close();
    }
}