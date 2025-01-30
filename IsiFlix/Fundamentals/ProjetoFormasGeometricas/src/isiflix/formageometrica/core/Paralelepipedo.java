package isiflix.formageometrica.core;

import isiflix.formageometrica.model.FormaGeometrica;
import isiflix.formageometrica.model.InterfaceForma3D;

public class Paralelepipedo extends FormaGeometrica implements InterfaceForma3D {

    private double altura;
    private double largura;
    private double profundidade;

    public Paralelepipedo(double altura, double largura, double profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "Paralelepipedo com valores: \n" + "Altura: " + this.altura + " Largura: " + this.largura + "Profundidade: " + this.profundidade + "\nVolume: " + this.calcularVolume();
    }

    @Override
    public double calcularVolume() {
        return altura * largura * profundidade;
    }


}
