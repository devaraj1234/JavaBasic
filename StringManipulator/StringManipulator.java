/* String trimAndConcat(String, String): Trim both input strings and then concatenate them. 
   Return the new string. Feel free to use the trim method of the String class. */

public class StringManipulator{
	public static String trimAndConcat(String str1, String str2){
		String concatStr = "";
		concatStr +=str1.trim()+str2.trim();
		return concatStr;
	}

/* Integer getIndexOrNull(String, char): Get the index of the character and return either the index
   or null. If the character appears multiple times, return the first index. Feel free to use the indexOf method of the String class. */

	public static Integer getIndexOrNull(String str, char character){
	
		if(str.indexOf(character)>0){
			return str.indexOf(character);
		}
		else {
            return null;
            }
	}

/* Integer getIndexOrNull(String, String): Get the index of the start of the substring and return either 
   the index or null. Feel free to use the indexOf method of the String class. */

	public static Integer getIndexOrNull(String str1, String str2){
		if(str1.indexOf(str2)>0){
			return str1.indexOf(str2);
		}
		else{
			return null;
		}
	}

/* String concatSubstring(String, int, int, String): Get a substring using a starting and ending index, and concatenate that with 
   the second string input to our method. Feel free to use the substring method of the String class. */

   public static String concatSubstring(String string1, int a, int b, String string2){
   		return string1.substring(a, b).concat(string2);

   }
}