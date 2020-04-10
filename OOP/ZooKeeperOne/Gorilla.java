public class Gorilla extends Mammal {
    public void throwSomething(){
        energy = energy - 5;
        System.out.println("This is from throw something");
		displayEnergy();
    }
    public void eatBananas() {
		energy += 10;
		System.out.println("This is from eatBananas");
		displayEnergy();
	}
	public void climb() {
		energy -= 10;
		System.out.println("This is from climb");
		displayEnergy();
	}
        
}