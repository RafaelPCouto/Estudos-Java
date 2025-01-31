package isiflix.formageometrica.app;

import isiflix.formageometrica.core.Circulo;
import isiflix.formageometrica.core.Cubo;
import isiflix.formageometrica.core.Paralelepipedo;
import isiflix.formageometrica.core.Quadrado;
import isiflix.formageometrica.model.FormaGeometrica;

public class MainApp {

    public static void main(String[] args) {
        FormaGeometrica formas[];
        formas = new FormaGeometrica[4];

        formas[0] = new Quadrado(3);
        formas[1] = new Circulo(2);
        formas[2] = new Paralelepipedo(3, 2, 5);
        formas[3] = new Cubo(4);

        for (FormaGeometrica f:formas) {
            System.out.println(f.toString());
        }
    }
}
