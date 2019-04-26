package entidades;

public class JefeProyecto extends Empleado
{

	private double incentivos;

	@Override
	// A) este override sobreescribe el "toString" del objeto padre Empleado, y solo pintar el incentivo.  
	//public String toString() {
	//	return "JefeProyecto [incentivos=" + incentivos + "]";
	//}

	
	// B) podemos heredar "a mano" los atributos del padre para anyadir la info que queresmos, pero haciendo uso de los getter.
	public String toString() {
		return "JefeProyecto [nombre=" + getNombre() + ", dni=" + getDni() + ", nomina=" + getNomina() + ", incentivos=" + incentivos + "]";
	}
	
	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}

	/*
	 * la clase Jefe de proyecto tiene un metodo para calcular su salario, que es Nomina (heredado de la clase Empleado) + incentivo 
	 */
	@Override
	public double calcularSueldo() {
		return getNomina() + incentivos;
	}
	
	
}
