package ejemplo1;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
	
	private static ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
	
	public static void main(String[] args) {
		
		//manera clasica de Java, pero Spring no lleva el control de este objeto.
		Persona pers = new Persona();
		pers.setNombre("Hommer J. Simpson");
		pers.setEdad(42);
		pers.setPeso(122.7);
		
		/*
		 * crear el contenedor de objetos, usando el fichero configuracion de carpeta "resources"
		 * dara de alta la persona que esta configurada en beans.
		 * cambiar info del contexto sera solo tocar el XML que no es codigo, se puede cambiar en caliente en PRO.
		 * 
		 */
	
		//para recuperar info de Lisa.
		Persona lisa = contexto.getBean("Lisa",Persona.class);
		System.out.println(lisa.getNombre());
		
		/*
		 * cuando spring te devuelve la refrencia de objeto tipo prototype, ya depende de ti su control, por eso habria que almacenar su info para no perderal
		 * por eso creamos un arrayList para almacenar las altas de prototype en una lista de singleton 
		 */
		
		Persona pers2 = contexto.getBean("personaGenerica",Persona.class);
		pers2.setNombre("Bart Simpson");
		
		ArrayList<Persona> listaPersonas = contexto.getBean("arrayPersonas",ArrayList.class);
		listaPersonas.add(pers2);
		System.out.println(listaPersonas);
		
		//
	    mostrarPersona(pers);
		
	}

	private static void mostrarPersona(Persona pers) {
		// TODO Auto-generated method stub
		imprimirPersona(pers);
	}

	private static void imprimirPersona(Persona pers) {
		// podemos pasar por todos los metodos el objeto "p" un conyazo...
		System.out.println(pers);
		// o con spring directamente hacemos refrencia al contexto que tiene lo que queremos. 
		Persona p2 = contexto.getBean("Lisa",Persona.class);
		System.out.println("lo que quiero ver" + p2);
	}
}
