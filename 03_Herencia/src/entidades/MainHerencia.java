package entidades;

import java.util.ArrayList;

public class MainHerencia 
{
	public static void main(String[] args) 
	{
		/*
		 * damos de alta algunos valores para cada objeto.
		 */
		
		Programador empleado = new Programador();
		empleado.setNombre("Domingo");
		empleado.setDni("089890923T");
		empleado.setNomina(1250.50);
		
		Programador mozoAlmacen = new Programador();
		mozoAlmacen.setNombre("Guillermo");
		mozoAlmacen.setDni("610886210G");
		mozoAlmacen.setNomina(950.00);
		
		JefeProyecto jefe = new JefeProyecto();
		jefe.setNombre("Julian");
		jefe.setDni("897876912D");
		jefe.setNomina(2250.50);
		jefe.setIncentivos(500); // este atributo es especifico de JefeProyecto, no es visible para Programador ni para Director.
		
		Director director = new Director();
		director.setNombre("Alberto");
		director.setDni("8901283771Q");
		director.setNomina(3250.50);
		
		/*
		 * asignamos los empleados (del tipo que corresponda) al director.
		 */
		
		ArrayList<Empleado> listaEmpleados = new ArrayList <>();
		listaEmpleados.add(empleado);
		listaEmpleados.add(mozoAlmacen);
		listaEmpleados.add(jefe);
		
		director.setListaEmpleados(listaEmpleados);

		
		// el tipo de variable (objeto) es "ArrayList<Empleado>" y asi se llamara en otros sitios.
		ArrayList<Empleado> empresa = new ArrayList <>();
		empresa.add(empleado);		// ocurrencia 0
		empresa.add(mozoAlmacen);	// ocurrencia 1
		empresa.add(jefe);			// ocurrencia 2
		empresa.add(director);		// ocurrencia 3
	
		// preguntamos dentro del array si la ocurrencia "j" es del objeto JefeProyecto, para luego obtener informacin exclusiva de el.
		
		int j=0;
		
		if (empresa.get(j) instanceof JefeProyecto)
		{
			//cast del tipo empresa
			JefeProyecto jefeproy = (JefeProyecto) empresa.getIncentivos(j);
			System.out.println();
		}
		
			
		calcularSueldo(empresa);
		
	}
	
	// calcular el salario de cada ocurrencia de la variable "empresa" que es del tipo "ArrayList<Empleado>"
	public static void calcularSueldo(ArrayList<Empleado> empresa) 
	{
		double total = 0;
		
		for (Empleado i: empresa)
		{
			System.out.println(i);
			System.out.println(i.calcularSueldo());
			total = total + i.calcularSueldo();
		}
		
		System.out.println("total de la empresa " + total);
	}
}
