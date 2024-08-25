package com.crud_user.clientapp.models.service;

import java.util.List;

import com.crud_user.clientapp.models.entity.Clientes;

public interface IClienteService {
	
	public List<Clientes> listarTodos();
	public void guardar(Clientes clientes);
	public Clientes buscarPorId(Long id);
	public void eliminar(Long id);
	
}
