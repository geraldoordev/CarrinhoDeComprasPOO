package modelos;

import java.util.ArrayList;
import java.util.List;

public class Cartão {

	private double saldo;
	private double limite;
	private List<Produto> produtos;

	public Cartão(double limite) {
		this.limite = limite;
		this.saldo = limite;
		this.produtos = new ArrayList<>();
	}
	public double getSaldo() {
		return saldo;
	}

	
	public double getLimite() {
		return limite;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public boolean lancaCompra(Produto produto) {
		if(this.saldo > produto.getPreco()) {
			this.saldo -= produto.getPreco();
			this.produtos.add(produto);
			return true;
		}
		return false;
	}
	
}
