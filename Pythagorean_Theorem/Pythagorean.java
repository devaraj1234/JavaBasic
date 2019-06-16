import java.lang.Math;
public class Pythagorean {
	public  double calculateHypotenuse(int legA, int legB){
		double squareOfAandB = ((legA)*(legA) + (legB)*(legB));
		double legC = Math.sqrt(squareOfAandB);
		// return squareOfAandB;
		return legC;

	} 
}