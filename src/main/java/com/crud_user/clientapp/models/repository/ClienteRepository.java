package com.crud_user.clientapp.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud_user.clientapp.models.entity.Clientes;

@Repository
public interface ClienteRepository extends CrudRepository<Clientes, Long> {

}
