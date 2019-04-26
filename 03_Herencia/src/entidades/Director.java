package entidades;

import java.util.ArrayList;

public class Director extends Empleado
{

	/*
	 * lista dinamica usa el tipo "arrayList" y ademas la lista esta compuesta de la clase Empleado.
	 */
	
	private ArrayList<Empleado> listaEmpleados;
	
	@Override
	public double calcularSueldo() 
	{
		double sueldo = getNomina() + (listaEmpleados.size()*50);   // size tiene el total de la lista. por cada empleado a su cargo 50 EUR mas que gana
		return sueldo;
	}

	public ArrayList<Empleado> getListaEmpleados() 
	{
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) 
	{
		this.listaEmpleados = listaEmpleados;
	}
	
}
