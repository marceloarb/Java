import java.util.*;
public class Human {
	String name = "";
	int strength = 3;
	int stealth = 3;
	int intelligence = 3;
	int health = 100;
//	Getters and Setters
	public void setHuman(String name) {
		this.name = name;
	}
	public String getHuman() {
		return  name;
	}
	public void setAll(int stealth,int strength, int intelligence, int health) {
		this.stealth = stealth;
		this.strength = strength;
		this.intelligence = intelligence;
		this.health = health;
	}
	public List<Object> getAll() {
		return Arrays.asList(strength,stealth,intelligence,health);
	}
	public void attack(Human human) {
		human.getAll();
		System.out.println(this.health-this.strength);
		System.out.println("this is my health"+this.health);
		System.out.println("this is my strength"+this.strength);
		System.out.println("this is my intelligence"+this.intelligence);
		System.out.println("this is my stealth"+this.stealth);
		
	}
}
