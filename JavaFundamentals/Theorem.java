import java.lang.Math;
public class Theorem {
    public double calculateHypotenuse(int legA, int legB){
        double legC = Math.sqrt(legA)+Math.sqrt(legB);
        return legC;
    }
}