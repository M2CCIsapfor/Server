package sapfor.test;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Login2 {
	private String login;
	private String password;
	
	public Login2(String l, String p){
		login=l;
		password=p;
	}
	
	public String getLogin2(){return login;}
	public String getPassword(){return password;}
	
	public void setLogin2(String l){login=l;}
	public void setPassword(String p){password=p;}
	
}