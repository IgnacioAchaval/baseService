package baseService.dao;

import java.util.List;


import baseService.model.Pelicula;
import common.dao.GenericDao;

public interface PeliculaDao extends GenericDao<Pelicula, Long>{
	
    public List<Pelicula> findByID(Long id);
    public List<Pelicula> getAllMovies();


	
}
