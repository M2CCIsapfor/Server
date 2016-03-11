package sapfor.test;


	import java.util.ArrayList;
	import java.util.List;

	/**
	 *
	 * @author Yannick - Abdourahman
	 */
	public class AgentCommun {

	    private String matricule;
	    private String nom;
	    private String prenom;
	    private List<SessionCommun> listeSessionsApprenant;
	    private List<SessionCommun> listeSessionsFormateur;
	    private List<StageCommun> listStages;

	    /**
	     * constructeur vide de l'agent
	     */
	    public AgentCommun() {
	        this.matricule = new String();
	        this.nom = new String();
	        this.prenom = new String();
	        this.listeSessionsApprenant = new ArrayList<SessionCommun>();
	        this.listeSessionsFormateur = new ArrayList<SessionCommun>();
	        this.listStages = new ArrayList<StageCommun>();
	    }

	    /**
	     * constructeur de l'agent
	     *
	     * @param matricule
	     */
	    public AgentCommun(String matricule) {
	        setMatricule(matricule);
	        this.nom = new String();
	        this.prenom = new String();
	        this.listeSessionsApprenant = new ArrayList<SessionCommun>();
	        this.listeSessionsFormateur = new ArrayList<SessionCommun>();
	        this.listStages = new ArrayList<StageCommun>();
	    }

	    /**
	     * constructeur de l'agent
	     *
	     * @param matricule de l'agent
	     * @param nom de l'agent
	     */
	    public AgentCommun(String matricule, String nom) {
	        setMatricule(matricule);
	        setNom(nom);
	        this.prenom = new String();
	        this.listeSessionsApprenant = new ArrayList<SessionCommun>();
	        this.listeSessionsFormateur = new ArrayList<SessionCommun>();
	        this.listStages = new ArrayList<StageCommun>();
	    }

	    /**
	     * constructeur de l'agent
	     *
	     * @param matricule
	     * @param nom
	     * @param prenom
	     */
	    public AgentCommun(String matricule, String nom, String prenom) {
	        setMatricule(matricule);
	        setNom(nom);
	        setPrenom(prenom);
	        this.listeSessionsApprenant = new ArrayList<SessionCommun>();
	        this.listeSessionsFormateur = new ArrayList<SessionCommun>();
	        this.listStages = new ArrayList<StageCommun>();
	    }

	    /**
	     *
	     * @return matricule
	     */
	    public String getMatricule() {
	        return matricule;
	    }

	    /**
	     *
	     * @return nom de l'agent
	     */
	    public String getNom() {
	        return nom;
	    }

	    /**
	     *
	     * @return prenom de l'agent
	     */
	    public String getPrenom() {
	        return prenom;
	    }

	    /**
	     *
	     * @return liste de sessions accessibles a l agent en tant qu apprenant
	     */
	    public List<SessionCommun> getListeSessionsApprenant() {
	        return listeSessionsApprenant;
	    }

	    /**
	     *
	     * @return liste de sessions accessibles a l'agent en tant que formateur
	     */
	    public List<SessionCommun> getListeSessionsFormateur() {
	        return listeSessionsFormateur;
	    }

	    /**
	     * setter du matricule de l agent
	     *
	     * @param matricule
	     */
	    public void setMatricule(String matricule) {
	        this.matricule = matricule;
	    }

	    /**
	     * setter du nom de l'agent
	     *
	     * @param nom
	     */
	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    /**
	     * setter du prenom de l'agent
	     *
	     * @param prenom
	     */
	    public void setPrenom(String prenom) {
	        this.prenom = prenom;
	    }

	    /**
	     * setter de la liste des sessions accessibles a l agent en tant qu
	     * apprenant
	     *
	     * @param listeSessionsApprenant
	     */
	    public void setListeSessionsApprenant(List<SessionCommun> listeSessionsApprenant) {
	        this.listeSessionsApprenant = listeSessionsApprenant;
	    }

	    /**
	     * setter de la liste des sessions accessibles a l agent en tant que
	     * formateur
	     *
	     * @param listeSessionsFormateur
	     */
	    public void setListeSessionsFormateur(List<SessionCommun> listeSessionsFormateur) {
	        this.listeSessionsFormateur = listeSessionsFormateur;
	    }

	    /**
	     *
	     * @return liste des stage que dirige l agent
	     */
	    public List<StageCommun> getListStages() {
	        return listStages;
	    }

	    /**
	     * setter de la liste des stages que dirige l agent
	     *
	     * @param listStages
	     */
	    public void setListStages(List<StageCommun> listStages) {
	        this.listStages = listStages;
	    }
	}

