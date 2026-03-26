package ud4.caso1;


//Subclase PokemonFuego: hereda atributos y métodos comunes de Pokemon
public class PokemonFuego extends Pokemon {

// Atributos propios del tipo fuego (mínimo 2 atributos nuevos)
private int temperaturaLlama; 
private int resistenciaCalor;

//Constructor sin parámetros
public PokemonFuego() {
	super(); //Llama al constructor vacio de Pokemon
}

// Constructor con parámetros
public PokemonFuego(String nombre, int nivel, int temperaturaLlama, int resistenciaCalor) {
	super(nombre, nivel, "Fuego"); // Inizializa los atributos heredados del padre
	this.temperaturaLlama = temperaturaLlama;
	this.resistenciaCalor = resistenciaCalor;
}

// Getters y setters propios
public int getTemperaturaLlama() {
	return temperaturaLlama;
}

public int getResistenciaCalor() {
	return resistenciaCalor;		
}

public void setTemperatuaLlama(int temperaturaLlama) {
	this.temperaturaLlama = temperaturaLlama;
}

public void setResistenciaCalor(int resistenciaCalor) {
	this.resistenciaCalor = resistenciaCalor;
}

// Método específico del tipo fuego (mínimo un método propio)
public void lanzaLlamas() {
	System.out.println(getNombre() + " usa LANZALLAMAS a " + temperaturaLlama + "ºC");
}

// ToString() sobrescrito ppara mostrar también atributos propios
@Override
public String toString() {
	return super.toString() + " [temperaturaLlama= " + temperaturaLlama + ", resistenciaCalor= " + resistenciaCalor + "]";
}


}

