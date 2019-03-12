package Recursion;

public class Ex2 {
	public static void main(String[] args) {
		String w = "daniel";
		if (isPalindrome(w).equals(w)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public static String isPalindrome(String str) {
		if (str.equals("")) {
			return "";
		} else if (str.equals(null)) {
			return null;
		} else {
			return str.charAt(str.length()-1) + isPalindrome(str.substring(0, str.length()-1));
		}
	}
}
