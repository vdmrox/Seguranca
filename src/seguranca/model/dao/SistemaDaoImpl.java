package seguranca.model.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;

import seguranca.model.domain.Role;
import seguranca.model.domain.Sistema;
import seguranca.model.domain.Usuario;

public class SistemaDaoImpl implements SistemaDao {
	
	@PersistenceContext(unitName="SegurancaPU")
	private EntityManager entityManager;
	
	@Inject
	private HttpServletRequest request;

	@Override
	public List<Sistema> getSistemas() {
		String usuarioLogado = request.getUserPrincipal().getName();
		Query query = entityManager.createQuery("from Usuario u left join fetch u.roles "
				+ "where u.login = :login");
		query.setParameter("login",usuarioLogado);
		Usuario usuario = (Usuario)query.getSingleResult();
		List<Sistema> sistemas = new ArrayList<>();
		for (Role role: usuario.getRoles()) {
			if (!sistemas.contains(role.getSistema())) {
				sistemas.add(role.getSistema());
			}
		}
		return sistemas;
	}

}
