package modelo.persistencia;
/*
 * dao = data access object
 * 
 * capa de acceso a objetos de negocio: el 90% de las vences es una base de datos.
 * 
 * simulamos una base datos en memoria.
 */

import java.util.ArrayList;
import modelo.entidades.Usuario;

public class DaoUsuario {

	private ArrayList<Usuario> listaUsuarios;	//lista de usuarios validos para la aplicacion.
	
	//constructor por defecto y dentro anyadimos la info de negocio o las conexiones con la BBDD.
	public DaoUsuario() 
	{
		listaUsuarios = new ArrayList<>();		//crea el objeto listaUsuarios de tipo array.		

		Usuario usuario = new Usuario();  		//crea el objeto usuario de tipo Usuario
		usuario.setNombre("Pepe");				//y le da valores a sus atributos: nombre y password a usuario
		usuario.setPassword("qwerty");
		listaUsuarios.add(usuario);				//y por ultimo lo mueve a la primera ocurrencia de lista de usuarios
		
		usuario = new Usuario();				//reutiliza la variable usuario, en otro espacio de memoria
		usuario.setNombre("Ana");				//anyade nombre y usuario a la variable usuario EN OTRO ESPACIO DE MEMORIA
		usuario.setPassword("1234");
		listaUsuarios.add(usuario);				// y lo mueve a la lista de usuarios.
		
	}
	
	//este metodo hace la consulta a la base de datos
	public ArrayList<Usuario> getListaUsuarios()
	{
		return listaUsuarios;
	}
	
	public Usuario getUsuario(String nombre) 
	{
		return null;
	}
	
}
