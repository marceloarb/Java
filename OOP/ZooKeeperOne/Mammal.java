public class Mammal {
    int energy = 100;
    public void energyLevel(int num){
        this.energy = num;
    }
    public int displayEnergy(){
        System.out.println("This is from Super"+this.energy);
        return this.energy;
    }
}   