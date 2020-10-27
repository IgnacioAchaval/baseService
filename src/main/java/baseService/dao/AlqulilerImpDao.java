package baseService.dao;

import org.springframework.stereotype.Repository;

import baseService.model.Alquiler;
import common.dao.GenericDaoImp;

@Repository
public class AlqulilerImpDao extends GenericDaoImp<Alquiler, Long> implements AlquilerDao{

}
