package ud4.caso1;

public class Combate {

	// Pokemon que participan en el combate
	private Pokemon pokemon1;
	private Pokemon pokemon2;
	
	//Constructor con parámetros
	public Combate(Pokemon pokemon1, Pokemon pokemon2) {
		this.pokemon1 = pokemon1;
		this.pokemon2 = pokemon2;
	}
	
	// Método que realiza el combate y devuelve el resultado
	public String iniciarCombate() {
		
		if (pokemon1.getNivel() > pokemon2.getNivel()) {
			return "Gana " + pokemon1.getNombre();
		} else if (pokemon2.getNivel() > pokemon1.getNivel()) {
			return "Gana " + pokemon2.getNombre();
		} else {
			return "El combate termina en EMPATE";
		}
	}
	
	// toString para imprimir qué Pokemon luchan
	@Override
	public String toString() {
		return "Combate [pokemon1= " + pokemon1.getNombre() +
				" , pokemon2= " + pokemon2.getNombre() + "]";
	}
}
