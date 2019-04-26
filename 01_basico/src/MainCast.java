
public class MainCast {
	public static void main(String[] args) {
		
		// cast: convertir tipos para que puedan asignarse valores entre variables.
		
		double real = 5.9882;
		
		//int entero = real; --> da error de codigo, pues un tipo integer no admite valores de tipo real
		
		int entero = (int)real; // convierte a integer antes de asignar el valor.
		System.out.println(entero);
		
		long numero = Math.round(real);
		System.out.println(numero);

	}
}
