package controller;

import model.Pedido;

public interface IDesconto {

	public double calculaDesconto(Pedido p);
	public void proximoDesconto(Pedido p);
	
}
