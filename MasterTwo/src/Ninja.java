
public class Ninja extends Human {
	public void ninja(String name) {
		this.stealth = 10;
		this.name = name;
		
	}
	public void steal(Human player) {
		player.setHealth(player.getHealth()-this.stealth);
		this.stealth += player.getHealth();
		System.out.println("this is from the player"+player.getHealth());
		System.out.println("this is from the ninja"+this.stealth);
	}
	public void runAway() {
		this.stealth -= 10;
	}
}
