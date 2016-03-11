package client.test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class SessionCommun {


	/**
	 *
	 * @author Yannick - Abdourahman
	 */


	    private UVCommun uv;
	    private Date date;
	    private String lieu;
	    private Integer nbMin;
	    private Integer nbMax;
	    private Integer nbFormateur;
	    private List<AgentCommun> listeApprenants;
	    private List<AgentCommun> listeFormateurs;

	    public SessionCommun() {
	        this.date = new Date();
	        this.lieu = new String();
	        this.listeApprenants = new ArrayList<AgentCommun>();
	        this.listeFormateurs = new ArrayList<AgentCommun>();
	        this.nbFormateur = new Integer(0);
	        this.nbMax = new Integer(0);
	        this.nbMin = new Integer(0);
	        this.uv = new UVCommun();

	    }

	    public SessionCommun(UVCommun uv, Date date, String lieu, Integer nbMin, Integer nbMax, Integer nbFormateur) {
	        setUv(uv);
	        setDate(date);
	        setLieu(lieu);
	        setNbMin(nbMin);
	        setNbMax(nbMax);
	        setNbFormateur(nbFormateur);
	        this.listeApprenants = new ArrayList<AgentCommun>();
	        this.listeFormateurs = new ArrayList<AgentCommun>();

	    }

	    public UVCommun getUv() {
	        return uv;
	    }

	    public Date getDate() {
	        return date;
	    }

	    public String getLieu() {
	        return lieu;
	    }

	    public Integer getNbMin() {
	        return nbMin;
	    }

	    public Integer getNbMax() {
	        return nbMax;
	    }

	    public Integer getNbFormateur() {
	        return nbFormateur;
	    }

	    public List<AgentCommun> getListeApprenants() {
	        return listeApprenants;
	    }

	    public List<AgentCommun> getListeFormateurs() {
	        return listeFormateurs;
	    }

	    public void setUv(UVCommun uv) {
	        this.uv = uv;
	    }

	    public void setDate(Date date) {
	        this.date = date;
	    }

	    public void setLieu(String lieu) {
	        this.lieu = lieu;
	    }

	    public void setNbMin(Integer nbMin) {
	        this.nbMin = nbMin;
	    }

	    public void setNbMax(Integer nbMax) {
	        this.nbMax = nbMax;
	    }

	    public void setNbFormateur(Integer nbFormateur) {
	        this.nbFormateur = nbFormateur;
	    }

	    public void setListeApprenants(List<AgentCommun> listeApprenants) {
	        this.listeApprenants = listeApprenants;
	    }

	    public void setListeFormateurs(List<AgentCommun> listeFormateurs) {
	        this.listeFormateurs = listeFormateurs;
	    }

	
}
