package ud4.caso1;

public class Pokemon {
	
	/* Declaración de atributos, deben ser private por encapsulación,
	evitando que se puedan tocar desde fuera, sin getters o setters */
	private String nombre;
	private int nivel;
	private String tipo;

	/* Constructor sin parámetros, se deja vacío para podeer crear el 
	objeto y luego asignar valores con setters */
Pokemon() {
}

	//Constructor acon parametros
Pokemon(String nombre, int nivel, String tipo) {
	this.nombre = nombre;
	this.nivel = nivel;
	this.tipo = tipo;
	}

	//Getters, permiten consultar datos sin acceder directamente a los atributos
public String getNombre() {
	return nombre;
}

public int getNivel() {
	return nivel;
}

public String getTipo() {
	return tipo;
}

	//Setters, permiten modificar datos de forma controlada
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
	return "Pokemon [nombre= " + nombre + ", nivel= " + nivel + ", tipo= " + tipo + "]";
}
}

