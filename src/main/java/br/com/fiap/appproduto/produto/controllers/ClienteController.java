package br.com.fiap.appproduto.produto.controllers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.appproduto.produto.model.Cliente;

@Controller
public class ClienteController {

	@GetMapping("/clientes")
	public ModelAndView index() {

		ModelAndView model = new ModelAndView("clientes/index");

		Cliente cliente1 = new Cliente(1, "Gio", "123", "Rua X");
		Cliente cliente2 = new Cliente(2, "Kev", "345", "Rua Y");
		Cliente cliente3 = new Cliente(3, "Gio", "456", "Rua Z");
		
		List<Cliente> clientes = Arrays.asList(cliente1, cliente2, cliente3);

		model.addObject("listarProdutos", clientes);

		return model;

	}

}
