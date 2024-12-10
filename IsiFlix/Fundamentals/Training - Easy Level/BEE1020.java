import java.util.Scanner;

public class BEE1020 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int days = teclado.nextInt();

        int years = days / 365;
        days = days % 365;

        int months = days / 30;
        days = days % 30;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", years, months, days);
        teclado.close();
    }
}