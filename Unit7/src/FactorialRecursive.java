
public class FactorialRecursive {
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	public static int factorial(int n) {
		if (n<=1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
	public static int taco() {
		return 4;
	}
}

