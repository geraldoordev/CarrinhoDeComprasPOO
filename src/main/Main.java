package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import modelos.*;

public class Main {

	public static void main(String[] args) {
		int key = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o limite do cartão: ");
		double limite = sc.nextDouble();
		Cartão cartao = new Cartão(limite);

		while(key == 1) {
			System.out.println("Digite a descrição do produto: ");
			String desc = sc.next();
			
			System.out.println("Digite o valor do produto: ");
			double valor = sc.nextDouble();

			Produto produto = new Produto(valor, desc);
			boolean compraEfetuada = cartao.lancaCompra(produto);
			
			if(compraEfetuada) {
				System.out.println("Compra realizada com sucesso!");
				System.out.println("Saldo atual: " + cartao.getSaldo());
				System.out.println("Deseja outro produto? 1- sim 2- não");
				key = sc.nextInt();
			} else {
				System.out.println("Saldo insuficiente");
				key = 0;
			}
			


		}

		System.out.println("*********************************");
		System.out.println("PRODUTOS ADQUIRIDOS: ");
		System.out.println("");
		Collections.sort(cartao.getProdutos());
		
		for(Produto p : cartao.getProdutos()) {
		System.out.println(p.getDescricao() + " - " + p.getPreco());
		System.out.println("");
		}
		
		System.out.println("Saldo Restante: " + cartao.getSaldo());
		System.out.println("*********************************");
	}
}
