package sapfor.test;
import java.util.*;

public class Participants {
	private Map<Integer, Integer> candidatsAp;
	private Map<Integer, Integer> candidatsFo;
	private Map<Integer, Boolean> apprenants;
	private Map<Integer, Boolean> formateurs;
	
	public Participants() {
		this.candidatsAp = new HashMap<Integer, Integer>();
		this.candidatsFo = new HashMap<Integer, Integer>();
		this.apprenants = new HashMap<Integer, Boolean>();
		this.formateurs = new HashMap<Integer, Boolean>();
	}

	public Map<Integer, Integer> getCandidatsAp() {
		return candidatsAp;
	}

	public void setCandidatsAp(Map<Integer, Integer> candidatsAp) {
		this.candidatsAp = candidatsAp;
	}

	public Map<Integer, Integer> getCandidatsFo() {
		return candidatsFo;
	}

	public void setCandidatsFo(Map<Integer, Integer> candidatsFo) {
		this.candidatsFo = candidatsFo;
	}

	public Map<Integer, Boolean> getApprenants() {
		return apprenants;
	}

	public void setApprenants(Map<Integer, Boolean> apprenants) {
		this.apprenants = apprenants;
	}

	public Map<Integer, Boolean> getFormateurs() {
		return formateurs;
	}

	public void setFormateurs(Map<Integer, Boolean> formateurs) {
		this.formateurs = formateurs;
	}
	
	
	
}
