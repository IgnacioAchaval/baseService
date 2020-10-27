package baseService.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import baseService.model.Pelicula;
import common.dao.GenericDaoImp;

@Repository
public class PeliculaImpDao extends GenericDaoImp<Pelicula, Long> implements PeliculaDao {
	
	@Override
	public List<Pelicula> findByID(Long id) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Pelicula> criteria = builder.createQuery(Pelicula.class);
        Root<Pelicula> entity = criteria.from(Pelicula.class);

        criteria.select(entity).where(builder.equal(entity.get("id"), id));
        return em.createQuery(criteria).getResultList();
	}
	
	@Override
	public List<Pelicula> getAllMovies() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Pelicula> criteria = builder.createQuery(Pelicula.class);
        Root<Pelicula> entity = criteria.from(Pelicula.class);

        criteria.select(entity);
        return em.createQuery(criteria).getResultList();
	}

}
