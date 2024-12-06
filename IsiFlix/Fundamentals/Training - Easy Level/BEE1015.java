import java.util.Scanner;
import java.lang.Math;

public class BEE1015 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double X1 = teclado.nextDouble(), Y1 = teclado.nextDouble(), X2 = teclado.nextDouble(), Y2 = teclado.nextDouble();

        double distancia = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
        
        System.out.printf("%.4f\n", distancia);

        teclado.close();
    }
}