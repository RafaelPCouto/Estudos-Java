package br.com.isiflix.ecommerce.ui;

import br.com.isiflix.ecommerce.core.Pedido;
import br.com.isiflix.ecommerce.core.Status;

public class Loja {
	public static void main(String[] args) {
		Pedido p = new Pedido(5, "10/01/2025", 563, "Mauricio de Nassau", Status.NOVO);
		
		System.out.println(p.exibir());
		
		p.setStatus(Status.FATURADO);
		
		System.out.println(p.exibir());
	}
}
