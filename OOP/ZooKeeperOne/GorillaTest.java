public class GorillaTest {
    public static void main(String[] args){
        Mammal fromSuper = new Mammal();
        Gorilla monkey = new Gorilla();
        fromSuper.energyLevel(200);
        fromSuper.displayEnergy();
        monkey.throwSomething();
        monkey.eatBananas();
        monkey.climb();
        monkey.climb();
    }
}