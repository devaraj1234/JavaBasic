import java.util.Arrays;

public class BasicsJavaTest{
	public static void main(String[] args){
		BasicsJava basics = new BasicsJava();
		
		basics.print1To255();
		basics.printOddNum();
		basics.printSum();

		int[] arr = {1,3,5,-7,9,13};
		
		basics.iterateArray(arr);
		System.out.println("\nMax value in arr is : " + basics.findMax(arr));
		System.out.println("\nAverage of the arr is : " + basics.findAverage(arr));
		System.out.println("\n"+basics.arrayOddNumbers());
		System.out.println("\n"+basics.numGreaterThanY(arr, 5));
		System.out.println("\n"+basics.squareOfArray(arr));

		System.out.println(Arrays.toString(basics.replaceNegative(arr)));
		System.out.println(Arrays.toString(basics.maxMinAvg(arr)));
		System.out.println(Arrays.toString(basics.shiftArray(arr)));
	
	
	}
}

