package client.test;

import java.util.List;

/**
 *
 * @author Yannick - Abdourahman
 */
public class StageCommun {
    private List<SessionCommun> listeSessions;
    private AgentCommun directeur;

    public StageCommun() {
    }

    public StageCommun(List<SessionCommun> listeSessions, AgentCommun directeur) {
        setListeSessions(listeSessions);
        setDirecteur(directeur);
    }
 
    public List<SessionCommun> getListeSessions() {
        return listeSessions;
    }

    public AgentCommun getDirecteur() {
        return directeur;
    }

    public void setListeSessions(List<SessionCommun> listeSessions) {
        this.listeSessions = listeSessions;
    }

    public void setDirecteur(AgentCommun directeur) {
        this.directeur = directeur;
    }
}
