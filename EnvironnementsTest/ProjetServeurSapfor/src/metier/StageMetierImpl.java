package metier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import metier.entities.Agent;
import metier.entities.UV;

public class StageMetierImpl implements IStageMetier{
	private Map<Long, Agent> agents = new HashMap<Long, Agent>();
	private Map<Long,UV>uv= new HashMap<Long,UV>();
    
	@Override
	public Agent addAgent(Agent a) {
		agents.put(a.getIdAgent(),a);		
		return a;
	}

	@Override
	public UV addUV(UV u) {
		/** associer un UV a une Agent  ou ajouter un UV
		 * apparteent une Agent
		 * */
		u.setAgent(getAgent(u.getAgent().getIdAgent()));
		uv.put(u.getId(),u);	
		
		return u;
	}

	@Override
	public List<Agent> listAgents() {	
			return new ArrayList<Agent>(agents.values());
	}

	@Override
	public List<UV>UVParAgent(Long idAg) {
		List<UV> uvs = new ArrayList<UV>();
		for(UV u:uv.values())
			if(u.getAgent().getIdAgent().equals(idAg))
				uvs .add(u);
	
		return uvs ;
	}

	@Override
	public List<UV> listUV() {
		
		return new ArrayList<UV>(uv.values());
	}

	@Override
	public List<UV>UVParMC(String mc) {
		List<UV> uvs = new ArrayList<UV>();
		for(UV u:uv.values())
			if(u.getNom().contains(mc))
				 uvs.add(u);
		return  uvs;
	}

	@Override
	public UV updateUV(UV u) {
		uv.put(u.getId(),u);	
		return u;
	}

	@Override
	public Agent updateAgent(Agent a) {
		agents.put(a.getIdAgent(),a);	
		return a;
	}

	@Override
	public boolean deletUV(Long iduv){
		if(uv.get(iduv)!=null){
			uv.remove(iduv);
			return true;
		}
		else throw new RuntimeException("UV introuvable");
	}

	@Override
	public Agent getAgent(Long idAg) {
		
		return agents.get(idAg);
	}

	@Override
	public UV getUV(Long id) {
	
		return uv.get(id);
	}
	
	public void initialiserStage(){
		
		addAgent(new Agent(1L, "Mamadou",new UV(1L, "UV1","UVFF2")));
		addAgent(new Agent(2L, "Kevin",new UV(2L, "UV1","UVFF2")));
		addAgent(new Agent(3L, "Seb",new UV(1L, "UV1","UVFF3")));
		addAgent(new Agent(4L, "oury",new UV(3L, "UV1","UVFF4")));
			
		uv.put(1L,new UV(3L, "UV1","UVFF2"));
		uv.put(2L,new UV(3L, "UV2","UVFF1"));
		uv.put(3L,new UV(3L, "UV4","UVFF4"));
		uv.put(4L,new UV(3L, "UV4","UVFF2"));
		uv.put(3L,new UV(3L, "UV1","UVFF5"));
		
	}

}
