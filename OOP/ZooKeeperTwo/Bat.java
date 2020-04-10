public class Bat extends Mammal{
    public void fly(){
        this.energy -= 50;
        System.out.println("This is from fly"+" "+this.energy);
    }
    public void eatHumans(){
        this.energy += 25;
        System.out.println("this is from eat humans"+" "+this.energy);
    }
    public void attackTown(){
        this.energy -= 100;
        System.out.println("this is from attack town"+" "+this.energy);
    }
}