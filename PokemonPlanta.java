package ud4.caso1;

	//Subclase PokemonPlanta: hereda atributos y métodos comunes de Pokemon
public class PokemonPlanta extends Pokemon {

	// Atributos propios del tipo planta (mínimo 2 atributos)
		private int clorofila; 
		private int espinas;

		//Constructor sin parámetros
		public PokemonPlanta() {
			super(); //Llama al constructor vacio de Pokemon
		}

		// Constructor con parámetros
		public PokemonPlanta(String nombre, int nivel, int clorofila, int espinas) {
			super(nombre, nivel, "Planta"); // Inizializa los atributos heredados del padre
			this.clorofila = clorofila;
			this.espinas = espinas;
		}

		// Getters y setters propios
		public int getClorofila() {
			return clorofila;
		}

		public int getEspinas() {
			return espinas;		
		}

		public void setClorofila(int clorofila) {
			this.clorofila = clorofila;
		}

		public void setEspinas(int espinas) {
			this.espinas = espinas;
		}

		// Método específico del tipo planta (mínimo un método propio)
		public void latigoCepa() {
			System.out.println(getNombre() + " usa LATIGO CEPA con espinas " + espinas);
		}

		// ToString() sobrescrito ppara mostrar también atributos propios
		@Override
		public String toString() {
			return super.toString() + " [clorofila= " + clorofila + ", espinas= " + espinas + "]";
		}


		}


