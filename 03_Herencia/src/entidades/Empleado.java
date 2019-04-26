package entidades;

public abstract class Empleado // no usamos extend -> por tanto extiende de "OBJECT" que es el objeto padre universal.
{
	
	private String nombre;
	private String dni;
	private double nomina;
	
	public abstract double calcularSueldo();
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", dni=" + dni + ", nomina=" + nomina + "]";
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getNomina() {
		return nomina;
	}
	public void setNomina(double nomina) {
		this.nomina = nomina;
	}

	
	
}
