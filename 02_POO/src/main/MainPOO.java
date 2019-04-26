package main;

//siempre que usemos una clae que no este en el paquete hay que importarla

import entidades.Persona;
import entidades.Direccion;

public class MainPOO 
{
	// visibilidad:
	// public: podemos acceder a un atributo desde cualquier otra clase
	// private: solo puede acceder a un atributo desde la propia clase
	
	public static void main(String[] args) 
	{
		// Tipo_variable + Nombre_Variable = NEW Clase_de_objeto()
		
		Persona cliente = new Persona(); 				//el new de Persona hace que se cree el objeto "Persona" con los valores siguientes.
		cliente.nombre = "Domingo Fernandez";
		cliente.edad = 45;
		cliente.peso = 95;
		//cliente.metros = 55; 							//al ser "metros" de tipo privado en otra clase, no podemos acceder a la variable.
		cliente.andar(15);
		
		Persona empleado = new Persona(); 
		empleado.nombre = "Guillermo Diaz";
		empleado.edad = 40;
		empleado.peso = 86;
		empleado.andar(40);
		
		Persona secretario = empleado; 					//el objeto "secretario" es el mismo que "empleado"
		
		System.out.println(secretario.getMetros());  	//los metros andados por "secretario" son los mismos que "empleado".
		
		cambiarEdad(secretario);
		System.out.println(secretario.edad);
		
		int numero = 5;									//variables  
		cambiarNumero(numero);
		System.out.println(numero);
		
		crearPersonaLocal();							// no tendra efecto, pues no haremos referencias, no se retorna valor alguno.
		
		Persona conserge = crearPersonaGlobal();		// tendra efecto, pues luego usaremos el retorno.
		System.out.println(conserge.edad);
		
		// creamos una variable para persona "pers1" con sus atributos
		Persona pers1 = new Persona("Julian",54,80,0);
		
		// creamos una variable para asignar una direccion
		Direccion persDireccion = new Direccion();
		
		// asignamos valores a la clase 
		pers1.direccion = persDireccion;
		pers1.direccion.tipoVia ="Calle";
		pers1.direccion.nombreVia ="del Oso";
		pers1.direccion.cp ="07991";
		pers1.direccion.ciudad ="Madrid";
		System.out.println(pers1.nombre + " - " + pers1.edad + " - " + pers1.direccion.tipoVia + " " + pers1.direccion.nombreVia);
	}
	
	public static void cambiarEdad(Persona cliente)
	{
		cliente.edad = 66;
	} // al usar variables referencias al salir de este metodo el contenido de edad se conserva.
	
	public static void cambiarNumero(int numero)
	{
		numero = 39;
	} // al usar variables primitivas al salir de este metodo el contenido de numero SE PIERDE.

	public static void crearPersonaLocal()
	{
		Persona inquilino = new Persona();
		inquilino.edad = 37;
	} // hemos creado una referencia dentro de un metodo (local), al que nadie hace referencia fuera... por lo que acaba siendo borrado.

	public static Persona crearPersonaGlobal()
	{
		Persona arrendador = new Persona();
		arrendador.edad = 72;
		return arrendador;
	} // hemos creado una referencia dentro de un metodo (local), que es referenciada desde fuera, porlo que se conserva el valor 
}
