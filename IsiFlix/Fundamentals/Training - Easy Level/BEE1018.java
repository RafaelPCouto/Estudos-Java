import java.util.Scanner;

public class BEE1018 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        // INPUT
        int value = teclado.nextInt(), numCash100, numCash50, numCash20, numCash10, numCash5, numCash2, numCash1, newValue;

        // PROCESS
        numCash100 = value / 100;
        newValue = value % 100;
        numCash50 = newValue / 50;
        newValue = newValue % 50;
        numCash20 = newValue / 20;
        newValue = newValue % 20;
        numCash10 = newValue / 10;
        newValue = newValue % 10;
        numCash5 = newValue / 5;
        newValue = newValue % 5;
        numCash2 = newValue / 2;
        newValue = newValue % 2;
        numCash1 = newValue / 1;

        // OUTPUT
        System.out.printf("%d\n%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00\n", value, numCash100, numCash50, numCash20, numCash10, numCash5, numCash2, numCash1);

        teclado.close();
    }
}