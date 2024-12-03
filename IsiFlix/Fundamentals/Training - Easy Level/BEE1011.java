import java.util.Scanner;

public class BEE1011{
    public static void main(String args[]) {
        Scanner teclado = new Scanner (System.in);
        double raio = teclado.nextDouble(), pi = 3.14159, volume;

        volume = (4/3.0) * pi * (raio * raio * raio);

        System.out.printf("VOLUME = %.3f\n", volume);

        teclado.close();
    }
}