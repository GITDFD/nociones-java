package javabeans;

/*
 *  POJO/javabean
 *  
 *  convenio para la creacion objetos simples o POJO (Plain Old Java Object). No tienen herencia ni logica compleja.
 *  
 *  para hacer una clase javabean: atributos privados y metodos accesores y modificadores publicos: GETTER/SETTER 
 */

public class Persona 
{
	private String nombre;
	private int edad;
	private double peso;
	
	//constructor
	public Persona(String nombre, int edad, double peso) {
		super();
		this.nombre = nombre;
		setEdad(edad);				//asi forzamos al constructor a usar el set con su validacion. para cuando usen el constructor desde fuera.
		this.peso = peso;
	}
	
	// anotacion: boton derecho, source + generate toString
	@Override		//anotacin de control
	public String toString() 
	{
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}

	//boton derecho, source, generate setter and getter

	public String getNombre() 
	{
		return nombre;
	}
	

		public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public int getEdad() 
	{
		return edad;
	}
	
	public void setEdad(int edad) 
	{
		if (edad <0) edad = 0; 	// podemos controlar lo que desde fuera quieran poner en esta variable
		
		this.edad = edad;
	}
	
	public double getPeso() 
	{
		return peso;
	}
	
	public void setPeso(double peso) 
	{
		this.peso = peso;
	}
	
	
}
