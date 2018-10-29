package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.service.MovieService;
import org.apache.log4j.Logger;

@Path("/movie")
public class MovieEndpoint {

	@Inject
	private MovieService service;

	@Path("/getAllMovies")
	@GET
	@Produces({ "application/json" })
	public String getAllMovies() {
		return service.getAllMovies();
	}
	
	@Path("/getMovie/{id}")
	@POST
	@Produces({ "application/json" })
	public String getMovie(@PathParam("id") Long id) {
		return service.getMovie(id);
	}

	@Path("/addMovie")
	@POST
	@Produces({ "application/json" })
	public String addMovie(String movie) {
		return service.addMovie(movie);
	}

	@Path("/deleteMovie/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteMovie(@PathParam("id") Long id) {
		return service.deleteMovie(id);
	}
	
	@Path("/updateMovie")
	@PUT
	@Produces({ "application/json" })
	public String updateMovie(@PathParam("id") Long id, String movie) {
		return service.updateMovie(id, movie);
	}

	public void setService(MovieService service) {
		this.service = service;
	}

}
