package metier;

import java.util.List;

import metier.entities.Agent;
import metier.entities.UV;

public interface IStageMetier {
	public Agent addAgent(Agent a);
	public UV addUV(UV u);
	public List<Agent> listAgents();
	public List<UV>UVParAgent(Long idAg);
	public List<UV> listUV();
	public List<UV>UVParMC(String mc);
	public UV updateUV(UV p);
	public Agent updateAgent(Agent c);
	public boolean deletUV(Long id);
	public Agent getAgent(Long idAg);
	public UV getUV(Long uv);
	
 
}
