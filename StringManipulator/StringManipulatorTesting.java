public class StringManipulatorTesting{
	public static void main(String[] args){
		StringManipulator manipulator = new StringManipulator();
		String str = manipulator.trimAndConcat("    Hello     ","     World    ");
		System.out.println(str); // result is HelloWorld 

		StringManipulator getIndex = new StringManipulator();
		char letter = 'o';
		Integer a = getIndex.getIndexOrNull("Coding", letter);
		Integer b = getIndex.getIndexOrNull("Hello World", letter);
		Integer c = getIndex.getIndexOrNull("Hi", letter);
		System.out.println("\n"+a); // result is 1
		System.out.println(b); // result is 4
		System.out.println(c); // result is null

		String word = "Hello";
		String subString = "llo";
		String notSubString = "world";
		Integer x = manipulator.getIndexOrNull(word, subString);
		Integer y = manipulator.getIndexOrNull(word, notSubString);
		System.out.println("\n"+x); // result is 2
		System.out.println(y); // result is null

		String word1 = manipulator.concatSubstring("Hello", 1, 2, "world");
		System.out.println("\n"+word1); // result is eworld
	}
}