import java.util.Scanner;

public class BEE1008 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Input

        int number = teclado.nextInt(), hoursWork = teclado.nextInt();
        double wageHour = teclado.nextDouble(), salary;

        // Process

        salary = hoursWork * wageHour;

        // Output

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", number, salary);

        teclado.close();
    }
}