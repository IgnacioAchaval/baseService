package baseService.dao;

import org.springframework.stereotype.Repository;

import baseService.model.Socio;
import common.dao.GenericDaoImp;

@Repository
public class SocioImpDao extends GenericDaoImp<Socio, Long> implements SocioDao{

}
