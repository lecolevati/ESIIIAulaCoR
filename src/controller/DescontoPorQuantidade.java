package controller;

import model.Pedido;

public class DescontoPorQuantidade implements IDesconto {

	@Override
	public double calculaDesconto(Pedido p) {
		double descontoTotal = 1.0d;
		if (p.getTamanho() > 10) {
			descontoTotal = descontoTotal - 0.08;
		}
		return p.getValor() * descontoTotal;
	}

	@Override
	public void proximoDesconto(Pedido p) {
		p.setValor(calculaDesconto(p));
		
		DescontoPorValor descValor = new DescontoPorValor();
		descValor.proximoDesconto(p);
	}

}
