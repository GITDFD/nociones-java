package ejemplo2;

public abstract class Arma {

		public String tipo;
		
		//el uso del tipo de arma se define despues
		public abstract void usar();

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		
}
