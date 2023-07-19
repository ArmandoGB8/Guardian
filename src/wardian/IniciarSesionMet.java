package wardian;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IniciarSesionMet {
    String user,Weon;
    String contra;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    /**
     * Default constructor
     */
    public int iniciarAdmon () throws FileNotFoundException{
        File folder=new File ("usuarios//"+user);
        int hi=0;
        File fichero = new File("usuarios//"+user+"//"+user+".txt");
            Scanner s = null;
            s = new Scanner(fichero);
        try{
        if(folder.exists()){
            System.out.println("Hola");
            hi++;
            String linea = s.nextLine();
            if(contra.equals(linea)){
                hi++;
            }
        }
        }
        catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if (s != null)
				s.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
        return hi;
    }
    public void setWeon(String ward)
    {
        Weon=ward;
    }
    public String getWeon()
    {
        return Weon;
    }
    private boolean bandera;

}