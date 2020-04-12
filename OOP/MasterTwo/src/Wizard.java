
public class Wizard extends Human{
	public void wizard(String name) {
		this.name = name;
		this.health = 50;
		this.intelligence = 8;
	}
	public void heal(Human player) {
		player.setHealth(player.getHealth()+this.intelligence);
		System.out.println(this.name + "Player healed"+ player.name);
	}
	public void fireball(Human player) {
		player.setHealth(player.getHealth()-(this.intelligence*5));
		System.out.println(player.name+"this is my new health after the fireball"+player.getHealth());
	}
}
