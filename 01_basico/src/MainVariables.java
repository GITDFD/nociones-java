
public class MainVariables {
	public static void main(String[] args) {
		//tipos de variables primitivas: el valor se almacena en la variable
		
		 int numeroNormal = 15;					//numeros pequeos
		 double importe = 12.34;				//numeros con decimales
		 long enteroGrande = 23_888_318_888L; 	//numeros grandes. OBLIGATORIO usar la "L" al final. Podemos poner "_" en un numero largo sin alterar el valor
		 boolean encontrado = true; 			//valores logicos
		 
		 System.out.println(enteroGrande);
		 
		//tipos de variables referencia: la referencia apunta a objeto, lo que guarda es la posicion de memoria donde se guarda el dato/objeto
		 
		 String texto = "Me llamo Earl";
		 
		 // operacion con cadedas:
		 
		 texto = texto + " ...pues yo Domingo";		//concatenar.
		 
		 System.out.println(texto);
	}
}
