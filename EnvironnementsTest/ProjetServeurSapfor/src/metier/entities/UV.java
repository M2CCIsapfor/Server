package metier.entities;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;

public class UV implements Serializable{
	private Long id;
	private String nom;
	private String niveau;
	private Agent agent;
	
	
	
	public UV() {
		super();
	}
	
	
	public UV(Long id, String nom, String niveau, Agent agent) {
		super();
		this.id = id;
		this.nom = nom;
		this.niveau = niveau;
		this.agent= agent;
	   }


	public UV(Long id, String nom, String niveau) {
		super();
		this.id = id;
		this.nom = nom;
		this.niveau = niveau;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setniveau(String niveau) {
		this.niveau = niveau;
	}


	public Agent getAgent() {
		return agent;
	}


	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	
	//@JsonIgnore    //pour ignorer la Agent à l'affichage
	
	}
	
