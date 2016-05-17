package seguranca.model.facade;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/logout")
public class LogoutFacade {
	
	@Inject
	private HttpServletRequest request;
		
	@GET
	public void logout() {
		request.getSession().invalidate();	
	}
	

}
