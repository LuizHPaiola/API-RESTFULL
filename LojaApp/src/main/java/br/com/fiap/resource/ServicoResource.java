package br.com.fiap.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/saldo")
public class ServicoResource{

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Double getSaldo() {
		return 134.00;
	}
}
