import java.io.Serializable;

public class Persona implements Serializable {
    
    static final long serialVersionUID = 1L;
    private String user, mail;
    private transient String password;
    
    public Persona(String user, String mail, String password){
        this.user = user;
        this.mail = mail;
        this.password = password;
    }

    public String getMail() {return mail;}
    public String getPassword() {return password;}
    public String getUser() {return user;}
}
