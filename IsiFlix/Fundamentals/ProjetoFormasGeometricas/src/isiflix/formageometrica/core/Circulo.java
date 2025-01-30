package isiflix.formageometrica.core;

import isiflix.formageometrica.model.FormaGeometrica;
import isiflix.formageometrica.model.InterfaceForma2D;

public class Circulo extends FormaGeometrica implements InterfaceForma2D {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.raio, 2) * Math.PI;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    @Override
    public String toString() {
        return "Circulo de raio: " + this.raio + "\n Area: " + this.calcularArea() + "\n Perimetro: " + this.calcularPerimetro();
    }
}
