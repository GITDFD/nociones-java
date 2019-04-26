package ejemplo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBatalla {

	private static ApplicationContext contexto = new ClassPathXmlApplicationContext("beansGuerra.xml");

	public static void main(String[] args) {
		
	/*
	 * Con Spring y usando el beansGuerra para la gestion de objetos, podemos hacer que guerro use un arma
	 * y slo tengo que cambiar el xml del beansGuerra para que cambien el nombre y el tipo de arma, sin tocar una linea de codigo.
	 */
		
		Guerrero guerrero2 = contexto.getBean("guerrero", Guerrero.class);
		guerrero2.atacar();		
	}
}
