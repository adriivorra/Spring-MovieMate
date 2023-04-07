package com.adrianivorra.springboot.backend.moviemate.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.adrianivorra.springboot.backend.moviemate.entity.Usuario;



public interface IUsuarioDao extends CrudRepository<Usuario, String>{

	@Query(value = "SELECT * FROM usuarios WHERE earth_distance(ll_to_earth(38.3880165, -0.4424075), ll_to_earth(CAST(latitude AS double precision), CAST(longitude AS double precision))) / 1000 <= 2;",
            nativeQuery = true)
	List<Usuario> buscarPorDistancia(@Param("latitud") Double latitud,
                              @Param("longitud") Double longitud,
                              @Param("distancia") Double distancia);
}
