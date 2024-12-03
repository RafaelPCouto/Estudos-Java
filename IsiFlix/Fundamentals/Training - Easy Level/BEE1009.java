import java.util.Scanner;

public class BEE1009 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        String nome = teclado.next();
        double salarioFixo = teclado.nextDouble(), totalVendas = teclado.nextDouble(), total;

        total = salarioFixo + totalVendas * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", total);

        teclado.close();

    }
}