package isiflix.formageometrica.core;

import isiflix.formageometrica.model.FormaGeometrica;
import isiflix.formageometrica.model.InterfaceForma2D;
import isiflix.formageometrica.model.InterfaceForma3D;

public class Cubo extends FormaGeometrica implements InterfaceForma2D, InterfaceForma3D {

    private double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public String toString() {
        return "Cubo de arestas: " + this.aresta + "\n Volume: " + this.calcularVolume() + "\n Valores referentes à uma face do Cubo: \nArea:" + this.calcularArea() + "\nPerimetro: " + this.calcularPerimetro();
    }

    @Override
    public double calcularVolume() {
        return Math.pow(this.aresta, 3);
    }

    @Override
    public double calcularPerimetro() {
        return this.aresta * 4;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.aresta, 2);
    }
}
