import java.util.Scanner;

public class BEE1012{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double A = teclado.nextDouble(), B = teclado.nextDouble(), C = teclado.nextDouble(), pi = 3.14159, alturaTrianguloRet, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        alturaTrianguloRet = A * C / 2.0;
        areaCirculo = pi * (C * C);
        areaTrapezio = (A + B) * C / 2.0;
        areaQuadrado = B * B;
        areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", alturaTrianguloRet, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);

        teclado.close();
    }
}