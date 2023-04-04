package com.adrianivorra.springboot.backend.moviemate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.adrianivorra.springboot.backend.moviemate.dao.IUsuarioDao;
import com.adrianivorra.springboot.backend.moviemate.entity.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioDao usuarioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> getAllUsers() {
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	@Transactional
	public Usuario save(Usuario user) {
		return usuarioDao.save(user);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findUserById(String uid) {
		return usuarioDao.findById(uid).orElse(null);
	}

	@Override
	@Transactional
	public void deleteUser(Usuario user) {
		usuarioDao.delete(user);
	}
	
	

}
