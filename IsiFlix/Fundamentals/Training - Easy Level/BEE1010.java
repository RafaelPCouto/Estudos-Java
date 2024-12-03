import java.util.Scanner;

public class BEE1010{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int codigo1, qtd1, codigo2, qtd2;
        double preco1, preco2;

        codigo1 =teclado.nextInt();
        qtd1 = teclado.nextInt();
        preco1 = teclado.nextDouble();
        codigo2 = teclado.nextInt();
        qtd2 = teclado.nextInt();
        preco2 = teclado.nextDouble();

        double total = preco1 * qtd1 + preco2 * qtd2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        teclado.close();
    }
}