package br.edu.uncisal.shoppingcart.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import br.edu.uncisal.shoppingcart.dao.StatusDao;
import br.edu.uncisal.shoppingcart.model.Status;
import br.edu.uncisal.shoppingcart.model.StatusType;

public class StatusDaoImpl extends JpaGenericDao<Status, Long> implements StatusDao {

	public StatusDaoImpl(Class<Status> classe) {
		super(classe);
	}

	public Status findByName(StatusType name) {
		String queryStr = "from Status s where s.name = :statusName";
		TypedQuery<Status> query = this.em.createQuery(queryStr, Status.class);
		query.setParameter("statusName", name);

		return query.getSingleResult();
	}	
	
	public static void main(String[] args) {
		StatusDao statusDao = new StatusDaoImpl(Status.class);
		
		Status status = statusDao.findByName(StatusType.AGUARDANDO_PAGAMENTO);
		
		System.out.println(status);
		
		List<Status> statusList = statusDao.findAll();
		
		for (Status s : statusList) {
			System.out.println(s);
		}
		
	}
	
}
