package controller;

import model.Pedido;

public class DescontoSegunda implements IDesconto {

	@Override
	public double calculaDesconto(Pedido p) {
		double descontoTotal = 1.0d;
		if (p.getDia().getDayOfWeek().getValue() == 1) {
			descontoTotal = descontoTotal - 0.05d;
		}
		return p.getValor() * descontoTotal;
	}

	@Override
	public void proximoDesconto(Pedido p) {
		p.setValor(calculaDesconto(p));
	}

}
