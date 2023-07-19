package wardian;

import java.io.IOException;

/**
 * 
 */
public class CrearUsuarioMet {
    Files fl=new Files();
   
    /**
     * 
     */
    private String usuario;

    /**
     * 
     */
    private String contraseña;

    /**
     * 
     */

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @param nombre 
     * @param contraseña 
     * @return
     */
    public boolean compararUsuario(String nombre, String contraseña) {
        // TODO implement here
        return false;
    }
    public boolean crearUsuario() throws IOException {
         fl.newCarpert("usuarios//"+usuario);
         boolean band=fl.newFile(usuario);
         fl.newFileC(usuario, "ingresos");
         fl.newFileC(usuario, "ingresosSup");
         fl.newFileC(usuario, "ingresosAdc");
         fl.newFileC(usuario, "egresos");
         fl.newFileC(usuario, "egresosSup");
         fl.newFileC(usuario, "egresosAdc");
         fl.newFileC(usuario, "presupuesto");
         fl.newFileC(usuario, "presupuestoSup");
         fl.newFileC(usuario, "metas");
         fl.newFileC(usuario, "ahorro");
         fl.newFileC(usuario, "RESTANTE");
         fl.writeFileLn(usuario, contraseña);
         return band;
    }
}