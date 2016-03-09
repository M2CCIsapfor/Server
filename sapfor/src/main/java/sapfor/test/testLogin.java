package sapfor.test;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.List;

public class testLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login nouveauLogin;
		Login login;
		
		// Get access to the service object
		ClientConfig config = new DefaultClientConfig();		
		
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());
		
		// Get all products
		
		login = service.type(MediaType.APPLICATION_JSON_TYPE).accept(MediaType.APPLICATION_JSON).get(Login.class);            

		afficher(login);
	}
/*        r = c.resource(URL + "/" + user.getId());  
        user = r.type(MediaType.APPLICATION_JSON_TYPE)  
                .accept(MediaType.APPLICATION_JSON_TYPE)  
                .get(User.class);  */

private static void afficher(Login login) {
	
		System.err.println(login.getLogin());
	
}

private static java.net.URI getBaseURI() {
	java.net.URI uri =
	 UriBuilder.fromUri("http://localhost:8080/rest/login?login=Mouktar&password=mo").build();
	return uri;
}
}
