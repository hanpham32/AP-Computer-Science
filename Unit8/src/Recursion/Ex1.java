package Recursion;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println(reverse("abc"));
		System.out.print(reverse("123"));
//		String a = "hello";
//		System.out.println(a.substring(0,4));
	}
	
	public static String reverse(String str) {
		if (str.equals("")) {
			return "";
		} else if (str.equals(null)) {
			return null;
		} else {
			return str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1));
		}
	}
}
