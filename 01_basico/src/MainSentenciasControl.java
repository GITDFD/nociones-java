import java.lang.invoke.SwitchPoint;

public class MainSentenciasControl {
	public static void main(String[] args) {
		// las llaves son opcionales y agrupan sentencias.
		
		// condicionales
		
		int numero=10;

		if (numero >= 10) // AND --> &&, OR --> ||, NOT --> !
			{
			System.out.println("es mayor o igual a 10");
			}
		else 
			{
			System.out.println("es menor a 10");
			}
		
		// bucle FOR: inicializa variable "i", condicion final bucle, incremento
		
		for(int i=0;i<=10;i++) 
		{
			System.out.println(i);
		}
		
		// bucle WHILE
		int j=0;
		while (j<=10)
		{
			System.out.println(j);
			j++;
		}
		
		
		// EVALUATE
		String diaSemana = "lunes";
				
		switch (diaSemana) 
			{
			case "lunes":
				System.out.println("estamos a lunes");
				break; // cerramos la sentencia swith, sino EJECUTARA TODAS los CASE aunque no se cumplan
	
			case "martes":
				System.out.println("estamos a mares");
				break;
				
			default:
				System.out.println("no se en que dia vivo...");
				break;
			}
		}
	}

