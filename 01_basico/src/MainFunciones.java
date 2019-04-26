import java.util.Arrays;

public class MainFunciones {
	// funcion principal: metodos de clase, no existe una funcion global, todos los metodos estan asociados a una clase.
	
	public static void main(String[] args) {
	
		// llamar a un metodo estatico se usa directamente el nombre del metodo y los parametros de entrada
		saludo("Domin");
		
		// una clase solo devuelve un resultado
		int resultado = suma(2, 4);
		System.out.println(resultado);
		
		// para obtener multiples resultados de una clase hay que crearse un array, pero todos compartirian la misma picture.
		double[] resultados = operaMat(2, 3); 
		System.out.println(Arrays.toString(resultados)); //OJO para imprimir los resultados de un array.
		
		//no hay uyn numero definido de parametros de entrada
		System.out.println(sumar(1,3,4,8,4));
		System.out.println(sumar(8,4));
		System.out.println(sumar());


		
	}
	
	
	// FUERA DEL MAIN declaramos las "funciones" o metodos que usaremos en el cuerpo del programa.
	
	// visibilidad: public
	// estatico o dinamic
	// retorno: void -> no devuelve nada
	// nombre del metodo
	// argumentos de entrada
	// sobrecarga de metodos: cuando dos metodos tienen el mismo nombre pero distintos tipos o numero de argumentos de entrada.
	
	
	public static void saludo(String nombre)
	{
		System.out.println("Hola " + nombre + " como estas?");
	}
	
	public static int suma(int num1, int num2)
	{
		int resultado = num1 + num2;
		return resultado;
	}
	
	public static double[] operaMat(double num1, double num2)
	{
		double[] resultados = new double[4];
		
		resultados[0] = num1 + num2;
		resultados[1] = num1 - num2;
		resultados[2] = num1 * num2;
		resultados[3] = num1 / num2;

		return resultados;
	}

	// numero de parametros de entrada varibles (en numero, opcinoes de entrada opcionales)
	public static int sumar(int...numeros)
	{
		// la variable "numeros" sera tratado como un array
		int resultadoFin = 0;
		for (int i:numeros)
		{
			resultadoFin += i; //es lo mismo que resultados = resultados + 1
		}
		return resultadoFin;
	}
	
}
 