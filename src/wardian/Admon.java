package wardian;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 */
public class Admon {
    String admon;
    String contra;

    public String getAdmon() {
        return admon;
    }

    public void setAdmon(String admon) {
        this.admon = admon;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public int iniciarAdmon () throws FileNotFoundException{
        File folder=new File ("usuarios//admon//"+admon+".txt");
        int hi=0;
        File fichero = new File("usuarios//admon//"+admon+".txt");
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
    private String texto;
    public String editarInicio() {
        return "";
    }
    public String editarEgresos() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String editarIngresos() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String editarPresupueso() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String editarMetas() {
        // TODO implement here
        return "";
    }

}