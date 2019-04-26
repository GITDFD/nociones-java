package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidades.Usuario;
import modelo.negocio.GestorUsuario;

/* 
 * en TOMCAT para crear servlet se usa un concepto igual que Spring: inversion de control.
 * este concepto nos dice que nosotros no vamos a gestionar directamente el ciclo de vida de este objeto servlet, lo hara tomcat
 * el que lo haga.
 * 
 * no tenemos que hacer "new" ni tampoco hacer referencias a el para que siga vivo el objeto.
 * 
 * la anotacion "webservlet" le dice a tomcat que esta clase tiene que ser gestionada por el IoC (inversion de Control)
 * la manera de acceder a este servlet va a ser segun el nombre que este dentro de la anotacion. 
 * es el nombre que se usara en html en "action"
 */

@WebServlet("/ControladorUsuario")
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	// procesa peticiones GET, ademas tiene referencias al request y response.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		String nombre = request.getParameter("nombreUsuario");
		String password = request.getParameter("passwordUsuario");
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setPassword(password);
		
		
		//llamamos al controlador para que procese la validaciones de usuario, password. 
		GestorUsuario gu = new GestorUsuario();
		
		if (gu.validarUsuario(usuario))		//validarUsuario es un metodo booleano que devuelve true o false
		{
			//todo OK --> llamaremos a una pagina que le de la bienvenida personalizada
			//conectamos con la capa vista JSP
			//creamos la tabla de atributos a pasar al JSP
			
			request.setAttribute("atributoUsuario", usuario); //pasamos el objeto usuario completo como atributo
			
			//llama al archivo JSP que queremos pintar y le pasamos la request/response.
			request.getRequestDispatcher("principal.jsp").forward(request, response);;
			
		}
		else
		{
			//no ha validado
			request.getRequestDispatcher("error.html").forward(request, response);;
		}
	}

	// procesa peticiones POST, que en el fondo llama a doGET, pues son casi lo mismo.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}