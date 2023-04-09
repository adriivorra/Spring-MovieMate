package com.adrianivorra.springboot.backend.moviemate.entity;
// Generated 12 mar 2023 23:54:59 by Hibernate Tools 4.3.6.Final

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Usuarios generated by hbm2java
 */
@Entity
@Table(name = "usuarios")
public class Usuario implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String uid;
	private String name;
	private String email;
	private String country;
	private String description;
	private Integer[] idsFavouritesMovies;
	private Integer[] idsFavouritesTvShows;
	private Integer[] idsShowLaterMovies;
	private Integer[] idsShowLaterTvShows;
	private Integer[] idsProviders;
	private Integer[] idsTheathreMovies;
	private Integer[] idsTopMovies;
	private Integer[] idsTopTvShows;
	private Integer[] idsTopGenres;
	private Double latitude;
	private Double longitude;
	private LocalDate birth_date;
	private Integer distance_preference;
	private Integer age_min_preference;
	private Integer age_max_preference;
	private Boolean public_profile;
	

	public Usuario() {
	}

	public Usuario(String uid, String email) {
		this.uid = uid;
		this.email = email;
	}

	public Usuario(String uid, String name, String email, String country,
			String description, Integer[] idsFavouritesMovies, Integer[] idsFavouritesTvShows,
			Integer[] idsShowLaterMovies, Integer[] idsShowLaterTvShows, Integer[] idsProviders,
			Integer[] idsTheathreMovies, Integer[] idsTopMovies, Integer[] idsTopTvShows,
			Integer[] idsTopGenres, Double latitude, Double longitude, LocalDate birth_date, Integer disntace_preference, 
			Integer age_min_preference, Integer age_max_preference, Boolean public_profile)  {
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.country = country;
		this.description = description;
		this.idsFavouritesMovies = idsFavouritesMovies;
		this.idsFavouritesTvShows = idsFavouritesTvShows;
		this.idsShowLaterMovies = idsShowLaterMovies;
		this.idsShowLaterTvShows = idsShowLaterTvShows;
		this.idsProviders = idsProviders;
		this.idsTheathreMovies = idsTheathreMovies;
		this.idsTopMovies = idsTopMovies;
		this.idsTopTvShows = idsTopTvShows;
		this.idsTopGenres = idsTopGenres;
		this.latitude = latitude;
		this.longitude = longitude;
		this.birth_date = birth_date;
		this.distance_preference = disntace_preference;
		this.age_min_preference = age_min_preference;
		this.age_max_preference = age_max_preference;
		this.public_profile = public_profile;
	}

	@Id

	@Column(name = "uid", unique = true, nullable = false)
	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "email", nullable = false)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "country")
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "ids_favourites_movies")
	public Integer[] getIdsFavouritesMovies() {
		return this.idsFavouritesMovies;
	}

	public void setIdsFavouritesMovies(Integer[] idsFavouritesMovies) {
		this.idsFavouritesMovies = idsFavouritesMovies;
	}

	@Column(name = "ids_favourites_tv_shows")
	public Integer[] getIdsFavouritesTvShows() {
		return this.idsFavouritesTvShows;
	}

	public void setIdsFavouritesTvShows(Integer[] idsFavouritesTvShows) {
		this.idsFavouritesTvShows = idsFavouritesTvShows;
	}

	@Column(name = "ids_show_later_movies")
	public Integer[] getIdsShowLaterMovies() {
		return this.idsShowLaterMovies;
	}

	public void setIdsShowLaterMovies(Integer[] idsShowLaterMovies) {
		this.idsShowLaterMovies = idsShowLaterMovies;
	}

	@Column(name = "ids_show_later_tv_shows")
	public Integer[] getIdsShowLaterTvShows() {
		return this.idsShowLaterTvShows;
	}

	public void setIdsShowLaterTvShows(Integer[] idsShowLaterTvShows) {
		this.idsShowLaterTvShows = idsShowLaterTvShows;
	}

	@Column(name = "ids_providers")
	public Integer[] getIdsProviders() {
		return this.idsProviders;
	}

	public void setIdsProviders(Integer[] idsProviders) {
		this.idsProviders = idsProviders;
	}

	@Column(name = "ids_theathre_movies")
	public Integer[] getIdsTheathreMovies() {
		return this.idsTheathreMovies;
	}

	public void setIdsTheathreMovies(Integer[] idsTheathreMovies) {
		this.idsTheathreMovies = idsTheathreMovies;
	}

	@Column(name = "ids_top_movies")
	public Integer[] getIdsTopMovies() {
		return this.idsTopMovies;
	}

	public void setIdsTopMovies(Integer[] idsTopMovies) {
		this.idsTopMovies = idsTopMovies;
	}

	@Column(name = "ids_top_tv_shows")
	public Integer[] getIdsTopTvShows() {
		return this.idsTopTvShows;
	}

	public void setIdsTopTvShows(Integer[] idsTopTvShows) {
		this.idsTopTvShows = idsTopTvShows;
	}

	@Column(name = "ids_top_genres")
	public Integer[] getIdsTopGenres() {
		return this.idsTopGenres;
	}

	public void setIdsTopGenres(Integer[] idsTopGenres) {
		this.idsTopGenres = idsTopGenres;
	}

	@Column(name = "latitude")
	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	@Column(name = "longitude")
	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	@Column(name = "distance_preference")
	public Integer getDistance_preference() {
		return distance_preference;
	}

	public void setDistance_preference(Integer distance_preference) {
		this.distance_preference = distance_preference;
	}

	@Column(name = "age_min_preference")
	public Integer getAge_min_preference() {
		return age_min_preference;
	}

	public void setAge_min_preference(Integer age_min_preference) {
		this.age_min_preference = age_min_preference;
	}

	@Column(name = "age_max_preference")
	public Integer getAge_max_preference() {
		return age_max_preference;
	}

	public void setAge_max_preference(Integer age_max_preference) {
		this.age_max_preference = age_max_preference;
	}

	@Column(name = "birth_date")
	public LocalDate getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(LocalDate birth_date) {
		this.birth_date = birth_date;
	}

	public Boolean getPublic_profile() {
		return public_profile;
	}

	public void setPublic_profile(Boolean public_profile) {
		this.public_profile = public_profile;
	}




	
}
