
public class HumanTest {
	public static void main(String[] args) {
		Human player1 = new Human();
		player1.setName("marcelo");
		Ninja ninja1 = new Ninja();
		ninja1.ninja("ninja");
		Wizard wizard1 = new Wizard();
		wizard1.wizard("wizard");
		Samurai samurai1 = new Samurai();
		samurai1.samurai("MAL");
		
		ninja1.steal(player1);
		wizard1.heal(player1);
		wizard1.fireball(player1);
		samurai1.deathBlow(player1);
		
	}
	
}
