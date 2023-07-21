package modelos;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
	private double preco;
	private String descricao;
	
	public Produto(double preco, String descricao) {
		this.preco = preco;
		this.descricao = descricao;
	}
	
	
	public double getPreco() {
		return preco;
	}



	public String getDescricao() {
		return descricao;
	}

	
	@Override
	public int compareTo(Produto outroProduto) {
		return Double.valueOf(this.preco).compareTo(Double.valueOf(outroProduto.preco));
	}
	
	@Override
	public String toString() {
		return getDescricao() + "(" + getPreco() + ")";
	}
}
