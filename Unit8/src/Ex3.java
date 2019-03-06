
public class Ex3 {
	public static void main(String[] args) {
		System.out.println(Fibo(0));
	}
	
	public static int Fibo(int n) {
		if (n <= 0) {
			return 1;
		} else {
			return Fibo(n-1) + Fibo(n-2);
		}
	}
}

// 0 + 1 = 1 0th
// 1 + 1 = 2 1st
// 1 + 2 = 3 2nd
// 2 + 3 = 5 3rd
// 3 + 5 = 8 4th
// 5 + 8
