import java.io.Serializable;
public class Persona implements Serializable {

    String usuario;
    String correo;
    String password;
    static final long serialVersionUID= 1L;
    
    public Persona(String usuario, String correo, String password) {
        this.usuario = usuario;
        this.correo = correo;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static long getIndicativo() {
        return serialVersionUID;
    }

}
