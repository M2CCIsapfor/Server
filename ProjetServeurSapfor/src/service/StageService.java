package service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.spi.resource.Singleton;

import metier.StageMetierImpl;
import metier.entities.Agent;
import metier.entities.UV;
/**
 * @Path("Stage") : pour creer un service
 * @author OurySow
 * *@Produces(MediaType.APPLICATION_JSON): consulter les donnée au format JSON
 * @Singleton: va indiquer à JSON d'instencier une seul fois StageMetierImpl() si on poura pas afficher si 
 * on fait un POST via la methode save
 */
@Singleton
@Path("/Stage")
@Produces(MediaType.APPLICATION_JSON+"; charset=utf-8")    
public class StageService {
	private StageMetierImpl metier;

	public StageService() {
		metier = new StageMetierImpl();
		metier.initialiserStage();
	}
	/**
	 *@GET pour obliger le clien a envoyer une requet par get
	 *@Produces(MediaType.APPLICATION_JSON): consulter les donnée au format JSON
	 * url a tester via navigateur 
	 * http://localhost:8080/ProjetServeurSapfor/Stage/Agents
	 */
	
	@GET
	@Path("/Agents")
	//@Produces(MediaType.APPLICATION_JSON)
	public List<Agent> consulterAgents() {
		return metier.listAgents();		
	}
	
	/*
	 * Dans @Path(??): on pet mettre l'url kon veut 
	 * exemple: @Path("/Agents/{idCat}/UVs") ou @Path("/Agents")
	 * ie chercher le UV d'une Agent dont id= idCat
	 * ou select from UV where Agent=id. 
	 * @PathParam (value=idCat) faire la correspondance entre 
	 * idCat de d @Path et celui dans UVParCat
	 * http://localhost:8080/TPWSJRS/Stage/Agents/1/UV
	 */
	@GET
	@Path("/Agents/{idAg}/UV")
	//@Produces(MediaType.APPLICATION_JSON)
	public List<UV> UVParAg(@PathParam (value="idAg")Long idAg) {
		return metier.UVParAgent(idAg);
		
	}
	
	/*
	 * Pour les mot cle on utilise Query param
	 * http://localhost:8080/ProjetServeurSapfor/Stage/UVs?mc=U
	 */
	@GET
	@Path("/UVs")
	//@Produces(MediaType.APPLICATION_JSON)
	public List<UV> UVParMC(@QueryParam(value="mc")String mc) {
		return metier.UVParMC(mc);
		
	}
	/**
	 * @PathParam: c'est pour le filtrage
	 * http://localhost:8080/ProjetServeurSapfor/Stage/Agents/1
	 **/
	@GET
	@Path("/Agents/{idAg}")
	@Produces(MediaType.APPLICATION_JSON)   
	public Agent getAgent(@PathParam(value="idAg")Long idAg){
		return metier.getAgent(idAg);
		
	}
    /** pour consulter un UV exemple le numero 2
	**http://localhost:8080/ProjetServeurSapfor/Stage/UVs/1
	***/
	@GET
	@Path("/UVs/{idUV}")
	//@Produces(MediaType.APPLICATION_JSON)   
	public UV getUV(@PathParam(value="idUV")Long idUV){
		return metier.getUV(idUV);
		
	}
	
	/**
	 * Ici on utilisera la methode POST car c'est un ajout des donnees vent du client
	 * @Consumes(MediaType.APPLICATION_JSON): oblige le clien a envoyer les donnée au format json
	 * par exemple ici nous on prend n'importe quel format
	 * Pour tester ici on envoit des donneer JSON en POST 
	 * exemple des donnée à envoyer: [{"id":3,"nom":"UV2","niveau":"UVFF1","agent":"sow"}]
	 */
	@POST
	@Path("/Agents")
	@Consumes(MediaType.APPLICATION_JSON)
	public Agent saveAgent(Agent a){
		return metier.addAgent(a);		 
	}
}
