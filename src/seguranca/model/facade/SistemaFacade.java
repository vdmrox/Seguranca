package seguranca.model.facade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import seguranca.model.dao.SistemaDao;
import seguranca.model.domain.Sistema;

@Path("/sistema")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class SistemaFacade {
	
	@Inject
	private SistemaDao sistemaDao;
	
	@GET
	public List<Sistema> getSistemas() {
		return sistemaDao.getSistemas();
	}

}
