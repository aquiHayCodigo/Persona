import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class texto implements Serializable {

    static File f = new File("personas.dat");

     public static void main(String[] args) {
        escribir();
        leer();
    }
 
    public static void escribir() {
        Persona p1 = new Persona("Juan", "juan@correo.es", "unaclave");

        try (OutputStream outputStream = new FileOutputStream(f);
             ObjectOutputStream writer = new ObjectOutputStream(outputStream);
        ){
            writer.writeObject(p1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void leer(){
        try (InputStream input= new FileInputStream(f);
            ObjectInputStream reader= new ObjectInputStream(input);
        ){
            // leer hasta que falle
            while (true) { 
                Object objeto= reader.readObject();
                Persona p= (Persona) objeto;
                System.out.println(p.getUsuario() + ", " + p.getCorreo() + ".");
            }
        } catch (Exception e) {
        }
    }
}
