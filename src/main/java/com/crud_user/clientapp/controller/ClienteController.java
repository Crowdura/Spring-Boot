package com.crud_user.clientapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud_user.clientapp.models.entity.Clientes;
import com.crud_user.clientapp.models.service.IClienteService;

@Controller
@RequestMapping("/views/clientes")
public class ClienteController {
	
	private IClienteService clienteService;
	
	@GetMapping("/")
	public String listarClientes( Model model ) {
		List<Clientes> ListadoClientes = clienteService.listarTodos();
		
		model.addAttribute("titulo", "Lista de clientes");
		model.addAttribute("clientes", ListadoClientes);
		return "/views/clientes/listar";
	}
}
