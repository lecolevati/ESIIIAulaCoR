package controller;

import model.Pedido;

public class DescontoPorValor implements IDesconto {

	@Override
	public double calculaDesconto(Pedido p) {
		double descontoTotal = 1.0d;
		if (p.getValor() > 1000.00d) {
			descontoTotal = descontoTotal - 0.10;
		}
		return p.getValor() * descontoTotal;
	}

	@Override
	public void proximoDesconto(Pedido p) {
		p.setValor(calculaDesconto(p));
		
		DescontoSegunda descSeg = new DescontoSegunda();
		descSeg.proximoDesconto(p);
		
	}

}
