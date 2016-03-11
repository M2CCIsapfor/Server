package sapfor.test;
import java.util.ArrayList;


import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;



import com.sun.jersey.spi.resource.Singleton;



@Singleton
@Path("{cleHashage}")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class SessionManager {
	private List<Agent> agentTest;
	private List<Session> sessionTest;
	@GET
	@Path("/sessions")
	public List<SessionCommun> SessionAccessibles(@PathParam("cleHashage") String cle){
		List<SessionCommun> sess=new ArrayList<SessionCommun>();
		Agent agent=agentTest.get(rechercheAgent(cle));
		
		for(Session s:sessionTest){
			if(rechercheUVrequis(agent,s)==true){
				SessionCommun nouvelle=new SessionCommun();
				nouvelle.setLieu(s.getLieu());
				nouvelle.setUv(new UVCommun(s.getId(),s.getNom()));
				sess.add(nouvelle);}
		}
		return sess;
	}
	
	
	
	public int rechercheAgent(String cle){
		//A MODIFIER cle de hashage à déterminer
		int indexAgentTrouve;
		indexAgentTrouve=agentTest.indexOf(cle);
		return indexAgentTrouve;
	}
	
	public boolean rechercheUVrequis(Agent agent, Session session){
		boolean requisAcquis=true;
		for(UV uvprerequis:session.getPrerequis()){
			if(agent.getAptitude().contains(uvprerequis)==false){requisAcquis=false;}
		}
		return requisAcquis;
	}
}
