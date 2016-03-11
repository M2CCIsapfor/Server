package sapfor.test;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/service")
public class service {
@GET
@Path("/simple")
public String simple(){
	return "Hello Vicky";
}
private List<Login> login;
public service(){
	login = new ArrayList<Login>();
	login.add(new Login("Julien", "ju"));
	login.add(new Login("Vicky", "vi"));
	login.add(new Login("Mamadou", "ma"));
	login.add(new Login("Sebastien", "se"));
	login.add(new Login("Mouktar", "mo"));}


@GET
@Produces({MediaType.APPLICATION_JSON})
@Path("{login}")


public synchronized String getProduitByUID(@QueryParam("login") String log) {
System.out.println("test");
for (Login p : login) {
	System.out.println(p.getLogin().equals(log));
	if (p.getLogin().equals(log)){ System.out.println("t2"); return "ok";}
}
return "null";                               // Aucun produit correspondant à l'uid
}
}
