
public class MainArray {
	public static void main(String[] args) {
		// array estaticos, una vez inicializados a un tamanyo no podra cambiarse, ejemplo 5 ocurrencias:
		int[] listaNumero = new int[5];
		
		listaNumero[0] = 1;
		listaNumero[1] = 2;
		listaNumero[2] = 3;
		//listaNumero[3] = 4;
		//listaNumero[4] = 5;
		
		for (int i=0;i<listaNumero.length;i++)
		{
			System.out.println(listaNumero[i]);
		}
		
		for (int j: listaNumero)
		{
			System.out.println(listaNumero[j]);
		}

	}
}
