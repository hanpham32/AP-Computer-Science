package Recursion;

public class Ex4 {
	public static void main(String[] args){
		System.out.println(GCD(3,4));
	}
	
	public static int GCD(int a, int b) {
		for (int i = 2; i<= (a>b ? a : b); i++) {
			if (a%i == 0 && b%i == 0) {
				return i * GCD(a/i, b/i);
			}
		}
		return 1;
	}
}

/* FIRST ATTEMPT
realize don't need a base case to check
if ((a<b ? a : b) < 0) {
	return 1;
} else {
	for (int i = 2; i <= (a>b ? a : b); i++) {
		if (a%i == 0 && b%i == 0) {
			return i * GCD(a/i, b/i);
		}
	}
	return 1;
}
*/


//int GCD = 0;
//int biggest = 0;
//if (a > b) {
//	biggest = a;
//} else {
//	biggest = b;
//}
//for (int i=1; i<biggest; i++) {
//	if (a%i == 0 && b%i == 0) {
//		GCD = i;
//	}
//}
//return GCD;
