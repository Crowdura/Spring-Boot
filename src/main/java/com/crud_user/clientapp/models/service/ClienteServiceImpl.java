package com.crud_user.clientapp.models.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud_user.clientapp.models.entity.Clientes;
import com.crud_user.clientapp.models.repository.ClienteRepository;


//Servicio dirigido a Cliente
@Service
public class ClienteServiceImpl implements IClienteService {

	private ClienteRepository clienteRepository;
	
	@Override
	public List<Clientes> listarTodos() {
		return (List<Clientes>) clienteRepository.findAllById(null);
	}

	@Override
	public void guardar(Clientes cliente) {
		clienteRepository.save(cliente);
	}

	@Override
	public Clientes buscarPorId(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		clienteRepository.deleteById(id);
	}

}
