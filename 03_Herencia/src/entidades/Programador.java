package entidades;

// con "extends Empleado" digo que la clase Programador hereda de Empleado
public class Programador extends Empleado
{

	/*
	 * el objeto programador, hereda atributos y metodos de Empleado. 
	 * No es una clase ABSTRACT pues podemos/sabemos resolver el contenido de la clase Programador, que es calcular su salario
	 * ABSTRACT no sabemos como implementar el objeto. 
	 * boton derecho, source, override/implement methods: para elegir el metodo que sabemos calcular
	 */
		
	@Override
	public double calcularSueldo() 
	{
		return getNomina();
	}
}
