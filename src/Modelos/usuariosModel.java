
package Modelos;
import java.util.ArrayList;

/* @author carlt*/
public class usuariosModel {
    public ArrayList<Usuarios> ListaUsuarios = new ArrayList<Usuarios>();
    
    public void AgregarUsuarios(String apellidos, String nombre, String telefono)
    {
        Usuarios nuevoUsuario = new Usuarios(apellidos, nombre, telefono);
        this.ListaUsuarios.add(nuevoUsuario);
    }
    
    public ArrayList ListaUsuarios()
    {
        return ListaUsuarios;
    }
}
