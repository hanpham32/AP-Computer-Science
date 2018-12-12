public class Exercise8 {
	public static void main(String[] args) {
		scanner("", 5);
	}
	
	public static void scanner(String word, int x) {
		int length = word.length();
		if (length > x) {
			System.out.println("the num is less than the String's length");
		} else if (length < x) {
			System.out.println("the num is greater than the String's length");
		} else {
			System.out.println("the num is equal the String's length");
		}
	}
}