package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.fiap.bo.ProdutoBO;
import br.com.fiap.to.ProdutoTO;

@Path("/produto")
public class ProdutoResource {

	
	ProdutoBO pb = new ProdutoBO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProdutoTO> buscar(){
		return pb.listar();
	}

	
	
}
