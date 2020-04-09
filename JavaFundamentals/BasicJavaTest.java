public class BasicJavaTest {
    public static void main(String[] args){
        BasicJava id = new BasicJava();
        // id.printnumbers();
        // id.printOddNumbers();
        // id.sum();
        int[] array={2,3,5,2,1};
        id.iterateArray(array);
        int[] testArr = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
        id.findMax(testArr);

        int[] testArr = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
        id.getAverage(testArr);

        id.arrayOddNumbers();

        int[] testArr = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
        id.greaterThanY(testArr, 3);

        int[] testArr = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
        id.squareTheValues(testArr);

        int[] testArr = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
        id.eliminateNegativeNumbers(testArr);

        int[] testArr = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
        id.maxMinAvg(testArr);

        int[] testArr = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
        id.shiftingValues(testArr);
    }
}