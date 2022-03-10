package br.com.fiap.appproduto.produto.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//identifica que essa classe é uma Controller
//fazer o import ao dar o erro (ctrl + space)
@Controller 
public class HomeController {

	@GetMapping("/home") //mapeia a rota
	public String home(HttpServletRequest request) {
		
		request.setAttribute("nomeUsuario", "Giovanni Kenji Mendes"); //setamos o atributo name
		
		return "home"; // retorno da própria home
		//precisa criar um HTML em templates, com o nome passado no return
	}
	
}
