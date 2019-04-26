package entidades;

public class Coche implements Movible{

		private String matricula;
		private String marca;
		private int posicion;
		
		//Getter y Setter
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}

		public int getPosicion() {
			return posicion;
		}
		public void setPosicion(int posicion) {
			this.posicion = posicion;
		}

		
		//Constructor:
		public Coche() {};
		public Coche(String matricula, String marca, int posicion) {
			super();
			this.matricula = matricula;
			this.marca = marca;
			this.posicion = posicion;
		}
	
		//toString:
		@Override
		public String toString() {
			return "Coche [matricula=" + matricula + ", marca=" + marca + "]";
		}
		
		
		@Override
		public void moverseLento() {
			// TODO Auto-generated method stub
			System.out.println(" Soy coche " + matricula + " y me movere lento 10 metros");
			posicion += 10;

		}
		@Override
		public void moverseRapido() {
			// TODO Auto-generated method stub
			System.out.println(" Soy coche " + matricula + " y me movere rapido 50 metros");
			posicion += 50;
			
		}
		@Override
		public int moverse(int metros) {
			// TODO Auto-generated method stub
			System.out.println(" Soy coche " + matricula + " y me movere " + metros + " metros");
			posicion += metros;
			return posicion;
		}
		
		
}
