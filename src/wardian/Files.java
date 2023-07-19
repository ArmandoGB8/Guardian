package wardian;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JOptionPane;
/**
 *
 * @author Bryann
 */
public class Files {

    private boolean bandera;
    public boolean newFile (String nombreF) throws IOException{
        String archivo= ("usuarios//"+nombreF+"//"+nombreF + ".txt");
        File fichero = new File(archivo);
        if (!fichero.exists())
            {
              try
              {
                BufferedWriter bw=new BufferedWriter(new FileWriter(archivo));  
                  bw.close();
              }
              catch (IOException ioe)
              {
                 ioe.printStackTrace(); 
              }
              bandera=false;
            }
            else if (fichero.exists())
            {
                
                bandera=true;
            }
        return bandera;
    }
    public void writeFile (String nombreF, String holis){
        String archivo= ("usuarios//"+nombreF+"//"+nombreF + ".txt");
        
              try
              {
                BufferedWriter bw=new BufferedWriter(new FileWriter(archivo,true));
                bw.write(holis + "::");
                bw.close();//se cierra el archivo
              } 
              catch (IOException ioe)
              {
                 ioe.printStackTrace();
              }
    }
    public void writeFileLn (String nombreF, String holis){
        String archivo= ("usuarios//"+nombreF+"//"+nombreF + ".txt");
        
              try
              {
                BufferedWriter bw=new BufferedWriter(new FileWriter(archivo,true));
                bw.write(holis);
                bw.newLine();
                bw.close();//se cierra el archivo
              } 
              catch (IOException ioe)
              {
                 ioe.printStackTrace();
              }
    }
    public void writeFileLN (String nombreF, String holis){
        String archivo= ("textos//"+nombreF + ".txt");
        
              try
              {
                BufferedWriter bw=new BufferedWriter(new FileWriter(archivo,true));
                bw.write(holis);
                bw.newLine();
                bw.close();//se cierra el archivo
              } 
              catch (IOException ioe)
              {
                 ioe.printStackTrace();
              }
    }
    
    public void newCarpert(String nombreF){
        File folder = new File(nombreF);
        if(!folder.exists())
        {
        folder.mkdir();
        System.out.println(folder);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El usuario ya existe","Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void writeFileTXT (String nombreF, String holis){
        String archivo= ("textos//"+nombreF+ ".txt");
        
              try
              {
                BufferedWriter bw=new BufferedWriter(new FileWriter(archivo,true));
                bw.write(holis);
                bw.close();//se cierra el archivo
              } 
              catch (IOException ioe)
              {
                 ioe.printStackTrace();
              }
    }
    public String readLastLine() throws IOException { 
        File file = new File("usuarios//accesos.txt"); 
        String lastLine = null; 
        if (file.exists()) { 
            BufferedReader br = new BufferedReader(new FileReader(file)); 
            String last = br.readLine(); 
            while (last != null) { 
            lastLine = last; 
            last = br.readLine(); 
            } 
            br.close(); 
        } 
        return lastLine; 
    } 
     public String readLastLinE(String user,String nombreF) throws IOException { 
        File file = new File("usuarios//"+user+"//"+nombreF+".txt"); 
        String lastLine = null; 
        if (file.exists()) { 
            BufferedReader br = new BufferedReader(new FileReader(file)); 
            String last = br.readLine(); 
            while (last != null) { 
            lastLine = last; 
            last = br.readLine(); 
            } 
            br.close(); 
        } 
        return lastLine; 
    } 
    public String readLastLINE(String nombref) throws IOException { 
        File file = new File("textos//"+nombref+".txt"); 
        String lastLine = null; 
        if (file.exists()) { 
            BufferedReader br = new BufferedReader(new FileReader(file)); 
            String last = br.readLine(); 
            while (last != null) { 
            lastLine = last; 
            last = br.readLine(); 
            } 
            br.close(); 
        } 
        return lastLine; 
    } 
    public void writeFileAcces (String holis){
        String archivo= ("usuarios//accesos.txt");
        
              try
              {
                BufferedWriter bw=new BufferedWriter(new FileWriter(archivo,true));
                bw.newLine();
                bw.write(holis);
                bw.close();//se cierra el archivo
                
              } 
              catch (IOException ioe)
              {
                 ioe.printStackTrace();
              }
    }
    public void writeFileFInal (String user, String file, String holis){
        String archivo= ("usuarios//"+ user+"//"+ file+".txt");
        
              try
              {
                BufferedWriter bw=new BufferedWriter(new FileWriter(archivo,true));
                bw.write(holis);
                bw.newLine();
                bw.close();//se cierra el archivo
                
              } 
              catch (IOException ioe)
              {
                 ioe.printStackTrace();
              }
    }
    public boolean newFileC (String user, String nombreF) throws IOException{
        String archivo= ("usuarios//"+user+"//"+nombreF + ".txt");
        File fichero = new File(archivo);
        if (!fichero.exists())
            {
              try
              {
                BufferedWriter bw=new BufferedWriter(new FileWriter(archivo));  
                  bw.close();
                  System.out.println("Creada");
              }
              catch (IOException ioe)
              {
                 ioe.printStackTrace(); 
              }
              bandera=false;
            }
            else if (fichero.exists())
            {
                System.out.println("Archivo Existente");
                bandera=true;
            }
        return bandera;
    }
    public void writeFile1line (String user, String file, String holis){
        String archivo= ("usuarios//"+ user+"//"+ file+".txt");
        
              try
              {
                BufferedWriter bw=new BufferedWriter(new FileWriter(archivo,true));
                bw.write(holis);
                bw.close();//se cierra el archivo
                
              } 
              catch (IOException ioe)
              {
                 ioe.printStackTrace();
              }
    }
    public void deleteFile(String user, String nombreF){
        File fichero = new File("usuarios//"+user+"//"+nombreF+".txt");
        if (fichero.delete()){
            System.out.println("Se llamaba");
        }
        else{
            System.out.println("El maldito no se quiere morir");
        }
    }
    public void deleteFilePres(String user){
        File fichero = new File("usuarios//"+user+"//presupuesto.txt");
        if (fichero.delete()){
            System.out.println("Se llamaba");
        }
        else{
            System.out.println("El maldito no se quiere morir");
        }
    }
    public void deleteFileAdm(String nombreF){
        File fichero = new File("textos//"+nombreF+".txt");

        if (fichero.delete()){
            System.out.println("Se llamaba");
        }
        else{
            System.out.println("El maldito no se quiere morir");
        }
    }
    public boolean newFileA (String nombreF) throws IOException{
        String archivo= ("textos//"+nombreF + ".txt");
        File fichero = new File(archivo);
        if (!fichero.exists())
            {
              try
              {
                BufferedWriter bw=new BufferedWriter(new FileWriter(archivo));  
                  bw.close();
                  System.out.println("Creada");
              }
              catch (IOException ioe)
              {
                 ioe.printStackTrace(); 
              }
              bandera=false;
            }
            else if (fichero.exists())
            {
                System.out.println("Archivo Existente");
                bandera=true;
            }
        return bandera;
    }
}