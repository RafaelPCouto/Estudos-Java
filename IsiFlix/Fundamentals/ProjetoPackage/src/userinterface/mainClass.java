package userinterface;

import core.Produto;

public class mainClass {
	public static void main(String[] args) {
		
		System.out.println("Testando pacotes");
		
		Produto p = new Produto(1, "Caneta Azul", 2000);
		
		System.out.println(p.exibirInfo());		
	}
}
