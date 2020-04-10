
public class HumanTest {
	public static void main(String[] args) {
		Human player1 = new Human();
		Human player2 = new Human();
		player1.setHuman("marcelo");
		player1.setAll(10, 20, 30, 100);
		player2.setHuman("Joao");
		player2.setAll(50, 100, 200, 300);
		player1.attack(player2);
		
		
		
		
	}
}	
