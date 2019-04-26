package entidades;

import java.util.ArrayList;

public class MainInterfaz {
	public static void main(String[] args) {

		Persona corredor1 = new Persona();
		corredor1.setNombre("Domingo");
		corredor1.setEdad(45);
		
		Persona corredor2 = new Persona();
		corredor2.setNombre("Adelaida");
		corredor2.setEdad(52);
		
		Persona corredor3 = new Persona();
		corredor3.setNombre("Lino");
		corredor3.setEdad(40);
		
		Coche coche1 = new Coche();
		coche1.setMatricula("1234 DFD");
		coche1.setMarca("Audi");
		
		Coche coche2 = new Coche();
		coche2.setMatricula("8978 REA");
		coche2.setMarca("Ferrari");

		Coche coche3 = new Coche();
		coche3.setMatricula("6812 FAR");
		coche3.setMarca("Seat");

		//ahora aunque no comparten nada Persona y Coche, podemos juntarlos en un nuevo tipo: Movible, 
		// para trabajar a la vez con coches y personas
		
		ArrayList<Movible> carrera = new ArrayList<>();
		carrera.add(corredor1);
		carrera.add(coche1);
		carrera.add(corredor2);
		carrera.add(coche2);
		carrera.add(corredor3);
		carrera.add(coche3);
		
		for (Movible participante: carrera)
		{
			if (participante instanceof Coche)
			{
				participante.moverse(1650);
			} 
			else
			{
				participante.moverse(80);
			}	
		}
	}
}
