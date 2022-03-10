package br.com.fiap.appproduto.produto.controllers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.appproduto.produto.model.Produto;

@Controller
public class ProdutoController {

	@GetMapping("/produtos")
	public ModelAndView index() {
		
		ModelAndView modelView = new ModelAndView("produtos/index");
		
		Produto produto1 = new Produto(1, "chocolate", 3, new BigDecimal(2));
		Produto produto2 = new Produto(2, "chocolate belga", 100, new BigDecimal(40));
		Produto produto3 = new Produto(4, "chocolate branco", 30, new BigDecimal(20));
		
		List<Produto> produtos = Arrays.asList(produto1, produto2, produto3);
		
		modelView.addObject("listarProdutos", produtos);
		
		return modelView;
		
	}
	
}
