package ud4.caso1;

public class CasoPractico1 {

	public static void main(String[] args) {
		
	//Crear Pokemon (usamos clases hijas)
	PokemonFuego charmander = new PokemonFuego("Charmander", 12, 900,70);
	PokemonAgua squirtle = new PokemonAgua("Squirtle",10,80,50);
	
	//Creae entrenadores y asignar su Pokemon(Asociación)
	Entrenador entrenador1 = new Entrenador("Ash", 1200, 15, "Pueblo Paleta", charmander);
	Entrenador entrenador2 = new Entrenador("Misty", 1100, 16, "Ciudad Celeste", squirtle);
	
	//Mostrar datos de entrenadores y sus Pokemon
	System.out.println("====DATOS DE ENTRENADORES====");
	System.out.println(entrenador1);
	System.out.println("Pokemon de " + entrenador1.getNombre() + " : " + entrenador1.getCompanhero());
	System.out.println();
	System.out.println(entrenador2);
	System.out.println("Pokemon de " + entrenador2.getNombre() + " : " + entrenador2.getCompanhero());
	
	System.out.println("\n=== COMBATE ===");
	
	//Organizar el combate entre los Pokemon principales
	Combate combate = new Combate(entrenador1.getCompanhero(), entrenador2.getCompanhero());
	System.out.println(combate);
	
	//Resultado del combate (comparación de niveles)
	String resultado = combate.iniciarCombate();
	System.out.println("Resultado: " + resultado);
	
	}
}

