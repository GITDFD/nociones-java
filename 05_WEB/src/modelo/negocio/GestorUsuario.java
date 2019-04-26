package modelo.negocio;

import java.util.ArrayList;
import modelo.entidades.Usuario;
import modelo.persistencia.DaoUsuario;

/*
 * esta capa se encarga del negocio vinculado a la aplicacion.
 * la funcionalidad de la aplicacion.
 * 
 * daremos de alta todos los metodos que controlen usuario.
 * 
 * aqui tendremos la comunicacion con el gestor de la base de datos.
 * 
 */

public class GestorUsuario {
	
	/**
	 * Metodo que valida si un usuario esta registrado
	 * 
	 * @param user usuario a validar.
	 * @return true si el usuario esta registrado
	 */
	
	public boolean validarUsuario(Usuario user)
	{
		//validamos que recibimos datos de entrada.
		if (user.getNombre().equals("")||user.getPassword().equals("")) 
		{
			return false;
		}
		//nos conectamos con el DAO para validar con los datos.
		
		DaoUsuario daoUsuario = new DaoUsuario();
		ArrayList<Usuario> listaUsuario = daoUsuario.getListaUsuarios();
		for (Usuario usuarioAux : listaUsuario)
			{
				if (usuarioAux.getNombre().equals(user.getNombre()) &&
					usuarioAux.getPassword().equals(user.getPassword()))
					{
						return true;
					}
			}
		return false;
	}
	
}