import java.util.Scanner;

public class BEE1142{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int numEntrada = teclado.nextInt();

        for (int cont = 1; cont <= (numEntrada * 4); cont++) {
            if (cont % 4 == 0) {
                System.out.print("PUM\n");
            } else {
                System.out.printf("%d ", cont);
            }
        }

        teclado.close();
    }
}