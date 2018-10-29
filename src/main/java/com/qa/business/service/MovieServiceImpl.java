package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.MovieRepository;

public class MovieServiceImpl implements MovieService{
	
	@Inject
	private MovieRepository repo;

	public String addMovie(String movie) {
		return repo.addMovie(movie);
	}

	@Override
	public String deleteMovie(Long id) {
		return repo.deleteMovie(id);
	}
	
	
	public String getAllMovies() {
		return repo.getAllMovies();
	}
	
	public void setRepo(MovieRepository repo) {
		this.repo = repo;
	}

	@Override
	public String updateMovie(Long id, String movie) {
		return repo.updateMovie(id, movie);
	}

	@Override
	public String getMovie(Long id) {
		return repo.getMovie(id);
	}
}
