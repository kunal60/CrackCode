/*
 * 
 * Assume you have a method isSubstring which checks if one word is a substring of another Given two strings,
 *  s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring 
 *  (i e , “waterbottle” is a rotation of “erbottlewat”)
 * 
 */

// https://www.youtube.com/watch?v=fKGBNCep3ZI

package PackageArrays;

public class CheckRotation {

	public static void main(String[] args) {

		String s1 = "waterbottle";
		String s2 = "erbottlewat";

		boolean result = checkIsSub(s1, s2);
		System.out.println(result);

	}

	private static boolean checkIsSub(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		String s1s1 = s1 + s1; // waterbottlewaterbottle
		// System.out.println(s1s1.indexOf(s2));
		if (s1s1.contains(s1))
			return true;
		else
			return false;
	}

}
