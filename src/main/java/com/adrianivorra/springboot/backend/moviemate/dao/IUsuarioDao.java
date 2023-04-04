package com.adrianivorra.springboot.backend.moviemate.dao;

import org.springframework.data.repository.CrudRepository;

import com.adrianivorra.springboot.backend.moviemate.entity.Usuario;



public interface IUsuarioDao extends CrudRepository<Usuario, String>{

}
