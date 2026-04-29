package pokemon;

// Subclase PokemonFuego: hereda de Pokemon
public class PokemonFuego extends Pokemon {

    private int temperaturaLlama;
    private int resistenciaCalor;

    public PokemonFuego() {
        super();
    }

    public PokemonFuego(String nombre, int nivel, int temperaturaLlama, int resistenciaCalor) {
        super(nombre, nivel, "Fuego");
        this.temperaturaLlama = temperaturaLlama;
        this.resistenciaCalor = resistenciaCalor;
    }

    public int getTemperaturaLlama() {
        return temperaturaLlama;
    }

    public int getResistenciaCalor() {
        return resistenciaCalor;
    }

    public void setTemperaturaLlama(int temperaturaLlama) {
        this.temperaturaLlama = temperaturaLlama;
    }

    public void setResistenciaCalor(int resistenciaCalor) {
        this.resistenciaCalor = resistenciaCalor;
    }

    public void lanzaLlamas() {
        System.out.println(getNombre() + " usa Lanzallamas a " + temperaturaLlama + "ºC");
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Temperatura llama: " + temperaturaLlama +
                " | Resistencia calor: " + resistenciaCalor;
    }
}

