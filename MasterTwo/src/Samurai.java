
public class Samurai extends Human{
	public void samurai(String name) {
		this.name = name;
		this.health = 200;
	}
	public void deathBlow(Human player) {
		player.setHealth(player.getHealth()-this.health);
		this.setHealth(this.getHealth()/4);
		System.out.println(this.name+"This is my new health that i am getting from humam class  "+ this.getHealth());
	}
}
