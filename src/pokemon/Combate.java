package pokemon;

public class Combate {

	// Pokemon que participan en el combate
	private IPokemon pokemon1;
	private IPokemon pokemon2;
	
	//Constructor 
	public Combate(IPokemon pokemon1, IPokemon pokemon2) {
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
			return "El combate termina en empate";
		}
	}
	
	// toString para imprimir qué Pokemon luchan
	@Override
	public String toString() {
		return "Combate: " + pokemon1.getNombre() + " vs "
				 + pokemon2.getNombre();
	}
}
