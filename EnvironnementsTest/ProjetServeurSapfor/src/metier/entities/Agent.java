package metier.entities;

import java.io.Serializable;

public class Agent implements Serializable{
	private Long idAgent;
	private String nomAgent;
	private UV uv;
	
	public Agent() {
		super();
	}

	public Agent(Long idAgent, String nomAgent,UV uv) {
		super();
		this.idAgent = idAgent;
		this.nomAgent = nomAgent;
		this.uv = uv;
	}

	public Long getIdAgent() {
		return idAgent;
	}

	public void setIdAgent(Long idAgent) {
		this.idAgent = idAgent;
	}

	public String getNomAgent() {
		return nomAgent;
	}

	public void setNomAgent(String nomAgent) {
		this.nomAgent = nomAgent;
	}

	public UV getUv() {
		return uv;
	}

	public void setUv(UV uv) {
		this.uv = uv;
	}
	
	

}
