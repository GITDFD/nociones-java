package javabeans;

import javax.annotation.Generated;

public class JavaBeanMain 
{
	public static void main(String[] args) 
	{
		Persona pers1 = new Persona("jose", -10, 95.5);
		System.out.println(pers1.getEdad());  	// me muestra la edad corregida. 
		System.out.println(pers1.getPeso());
		System.out.println(pers1); 				//porque hemos creado el string to string, permite ver OK todo el objeto Persona
	}
}
