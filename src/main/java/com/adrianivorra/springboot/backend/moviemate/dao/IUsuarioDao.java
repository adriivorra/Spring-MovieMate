package com.adrianivorra.springboot.backend.moviemate.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.adrianivorra.springboot.backend.moviemate.entity.Usuario;



public interface IUsuarioDao extends CrudRepository<Usuario, String>{

	@Query(value = "SELECT * FROM usuarios WHERE earth_distance(ll_to_earth(:latitud, :longitud), "
			+ "ll_to_earth(latitude, longitude)) / 1000 <= :distancia AND uid != :uid "
			+ "AND public_profile = true AND date_part('year', age(birth_date)) BETWEEN :age_min AND :age_max "
			+ "ORDER BY earth_distance(ll_to_earth(:latitud, :longitud), ll_to_earth(latitude, longitude));", nativeQuery = true)
	
	Page<Usuario> buscarPorDistancia(@Param("latitud") Double latitud,
                              @Param("longitud") Double longitud,
                              @Param("distancia") Integer distancia,
                              @Param("uid") String uid,
                              @Param("age_min") Integer age_min,
                              @Param("age_max") Integer age_max,
                              Pageable pageable);
}
