package pokemon;

public class Pokemon implements IPokemon {
	
	// Atributos encapsulados
	private String nombre;
	private int nivel;
	private String tipo;

	// Constructor sin parámetros
public Pokemon() {
}

	//Constructor con parametros
public Pokemon(String nombre, int nivel, String tipo) {
	this.nombre = nombre;
	this.nivel = nivel;
	this.tipo = tipo;
	}

	//Getters
@Override
public String getNombre() {
	return nombre;
}

@Override
public int getNivel() {
	return nivel;
}

@Override
public String getTipo() {
	return tipo;
}

	//Setters
public void setNombre(String nombre) {
	this.nombre =nombre;
}

public void setNivel(int nivel) {
	this.nivel = nivel;
}

  public void setTipo(String tipo) {
        this.tipo = tipo;
    }

@Override
public String toString() {
	return "Pokemon: " + nombre + " | Nivel: " + nivel + " | Tipo: " + tipo;
}
}

