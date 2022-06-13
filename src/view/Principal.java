package view;

import java.time.LocalDate;

import controller.DescontoPorQuantidade;
import model.Pedido;

public class Principal {

	public static void main(String[] args) {
		Pedido p = new Pedido();
		p.setId(1);
		p.setTamanho(11);
		p.setValor(900.00d);
		p.setDia(LocalDate.now());
		
		DescontoPorQuantidade descQuant = new DescontoPorQuantidade();
		descQuant.proximoDesconto(p);
		
		System.out.println(p);
		
	}

}
