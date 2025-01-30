package isiflix.formageometrica.core;

import isiflix.formageometrica.model.FormaGeometrica;
import isiflix.formageometrica.model.InterfaceForma2D;

public class Quadrado extends FormaGeometrica implements InterfaceForma2D {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado de lado " + this.lado + "\n Area: " + this.calcularArea() + "\n Perimetro: " + this.calcularPerimetro();
    }

    @Override
    public double calcularPerimetro() {
        return this.lado * this.lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * 4;
    }
}
