import java.util.Scanner;

public class BEE1019 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);


        int N = teclado.nextInt();
        int H = N / 3600;
        N = N % 3600;
        int M = N / 60;
        N = N % 60;
        int S = N;

        System.out.printf("%d:%d:%d\n", H, M, S);

        teclado.close();
    }
}