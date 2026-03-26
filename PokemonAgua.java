package ud4.caso1;


	//Subclase PokemonAgua: hereda atributos y métodos comunes de Pokemon
public class PokemonAgua extends Pokemon {
	
	// Atributos propios del tipo agua (mínimo 2 atributos)
	private int presionChorro; 
	private int capacidadDeposito;

	//Constructor sin parámetros
	public PokemonAgua() {
		super(); //Llama al constructor vacio de Pokemon
	}

	// Constructor con parámetros
	public PokemonAgua(String nombre, int nivel, int presionChorro, int capacidadDeposito) {
		super(nombre, nivel, "Agua"); // Inizializa los atributos heredados del padre
		this.presionChorro = presionChorro;
		this.capacidadDeposito = capacidadDeposito;
	}

	// Getters y setters propios
	public int getPresionChorro() {
		return presionChorro;
	}

	public int getCapacidadDeposito() {
		return capacidadDeposito;		
	}

	public void setPresionChorro(int presionChorro) {
		this.presionChorro = presionChorro;
	}

	public void setCapacidadDeposito(int capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}

	// Método específico del tipo agua (mínimo un método propio)
	public void pistolaAgua() {
		System.out.println(getNombre() + " usa PISTOLA AGUA con presión " + presionChorro);
	}

	// ToString() sobrescrito ppara mostrar también atributos propios
	@Override
	public String toString() {
		return super.toString() + " [presionChorro= " + presionChorro + ", capacidadDeposito= " + capacidadDeposito + "]";
	}


	}




