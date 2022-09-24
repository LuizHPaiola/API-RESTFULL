package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.to.ProdutoTO;

public class ProdutoDAO {
		public static List<ProdutoTO> listaProduto;
	
	public ProdutoDAO() {
		if(listaProduto == null) {
			listaProduto = new ArrayList<ProdutoTO>();
			ProdutoTO pto = new ProdutoTO();
			pto.setCodigo(1);
			pto.setPreco(27.99);
			pto.setQuantidade(10);
			pto.setTitulo("Grampeador");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(2);
			pto.setPreco(29.99);
			pto.setQuantidade(30);
			pto.setTitulo("Vassoura");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(3);
			pto.setPreco(19.99);
			pto.setQuantidade(100);
			pto.setTitulo("Lapiseira");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(4);
			pto.setPreco(1.99);
			pto.setQuantidade(120);
			pto.setTitulo("Borracha");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(5);
			pto.setPreco(99.99);
			pto.setQuantidade(30);
			pto.setTitulo("Mochila");
			listaProduto.add(pto);
		}
		 
	}
	public  List<ProdutoTO> select(){
		return listaProduto;
	}
}
