
public class Pokemon {
	private String name = "";
	private int health = 0;
	private String type = "";
	private int pokemons = 0;
	
	// constructor
	public Pokemon(String name,String type,int health) {
		this.name = name;
		this.type = type;
		this.health = health;
		this.pokemons ++;
	}
	// getters
	public String getName() {
		return this.name;
	}
	public String getType() {
		return this.type;
	}
	public int getHealth() {
		return this.health;
	}
	// setters
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth() - 10);
	}
	
}
