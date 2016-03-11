package sapfor.test;

import java.util.ArrayList;
import java.util.List;



public class Donnees {
	public List <UV> listeUv;
	public List<Session> listeSession;
	public Donnees(){		
	listeUv =new ArrayList<UV>();
	listeUv.add(new UV(1, "Feu de poubelle niv1", 1));
	listeUv.add(new UV(2, "Feu de cheminée niv1", 1));
	
}}
