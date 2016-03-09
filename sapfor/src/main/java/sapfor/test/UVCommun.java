package sapfor.test;


	import java.util.List;

	/**
	 *
	 * @author Yannick - Abdourahman
	 */
	public class UVCommun {
	    private Integer numero;
	    private String nom;

	    public UVCommun() {
	        this.numero = new Integer(0);
	        this.nom = new String();
	    }

	    public UVCommun(Integer numero, String nom) {
	        setNumero(numero);
	        setNom(nom);
	    }

	    public Integer getNumero() {
	        return numero;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNumero(Integer numero) {
	        this.numero = numero;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }
	    
	    
	
}
