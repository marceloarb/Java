public class Pokedex extends AbstractPokemon {
    public void pokemonInfo(Pokemon pokemon){
        System.out.println("Name: "+pokemon.getName()+" Health: "+pokemon.getHealth()+" Type: "+pokemon.getType());
    }
}