
public class Exercise4 {
	public static void main(String[] args) {
		int[] nums = {36,12,25,19,46,31,22};
		range(nums);
	}
	
	public static void range(int[] range) {
		int numMax = range[0], numMin = range[0], difference;
		for (int i=0; i<range.length; i++) {
			if (numMax < range[i]) {
				numMax = range[i];
			}
			i++;
		}
		
		for (int i=0; i<range.length; i++) {
			if (numMin > range[i]) {
				numMin = range[i];
			}
		}
		difference = numMax - numMin + 1;
		System.out.println(difference);
	}
}
