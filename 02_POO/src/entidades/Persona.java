package entidades;

public class Persona 
{
	// visibilidad:
	// 		public: podemos acceder a un atributo desde cualquier otra clase
	// 		private: solo puede acceder a un atributo desde la propia clase

	// los atrubutos se inicializan a NULL si son referencias, 0 si son primitivos y FALSE si son booleanos.
	
	public String nombre;
	public int edad;
	public double peso;
	public Direccion direccion;
	private int metros; // PRIVATE: nadie puede acceder a esta variable desde fuera de esta clase.

	//Todos los objetos tienen que tener un constructor.
	// constructor por defecto:
	public Persona(){}
	
	
	// constructor generado con todas las variables, mas parecido de usar luego, es como una funcion.
	// generado: boton derecho + Source + Generate constructor using fields.
	public Persona(String nombre, int edad, double peso, int metros) {
		super();	//palabra resetrvada que invoca al constructor padre.
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.metros = metros;
	}

	public void andar(int metros)
	{
		this.metros += metros; // con this hacemos referencia al propio objeto original (fuera de la funcion) y no al metros declarado en el metodo o funcion
	}
	
	public int getMetros()
	{
		return metros; // no hace falta usar this, pues en este metodo no hay ninguna otra variable que se llame igual. 
	}
	
}