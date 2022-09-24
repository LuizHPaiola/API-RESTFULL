package br.com.fiap.resource;

import java.lang.reflect.Array;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/dados")
public class PessoaResource {

	
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String[][] informacoes() {
		
		String[][] nomes = {{"Luiz", "1234567890", "Luiz@gmail.com"},{"Ale", "1234567890", "Ale@gmail.com"},{"Valentina", "1234567890", "Va@gmail.com"},
				{"Lucas", "1234567789", "Lucas@gmail.com"},{"Pedro", "1234102943", "Pedro@gmail.com"}};
		return nomes;
	}
}
