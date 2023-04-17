package com.adrianivorra.springboot.backend.moviemate.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.adrianivorra.springboot.backend.moviemate.entity.Like;
import com.adrianivorra.springboot.backend.moviemate.entity.Usuario;
import com.adrianivorra.springboot.backend.moviemate.services.LikeServiceImpl;
import com.adrianivorra.springboot.backend.moviemate.services.UsuarioServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/usuarios")
public class LikeRestController {
    
    @Autowired
    private LikeServiceImpl likeService;
    
	@Autowired
	private UsuarioServiceImpl usuarioService;
	

	@PostMapping("/like")
	@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> addLike( @RequestBody List<Usuario> users) {
            
        Like like = null;
		Map<String, Object> response = new HashMap<>();
		
		try {
			like = likeService.darLike(users.get(0), users.get(1));
		}catch (DataAccessException e) { //La base de datos esta apagada
			response.put("mensaje", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if(like == null) {
			response.put("mensaje", "Like ya en la BBDD");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.FOUND);
		}
		response.put("mensaje", "El like se ha insertado con exito!");
		response.put("like", like);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }
	
	
}
