package agendaspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import agendaspring.contatos.Contatos;

@Controller
public class ContatoController {

	@RequestMapping("/contatos/form")
	public String form() {
		System.out.println("Chamou o form de contatos");
		return "contatos/form";
	}
	
	@RequestMapping("/contatos")
	public String adicionar(Contatos contato) {
		
		return "contatos/ok";
	}
	
}
