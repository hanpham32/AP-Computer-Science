import java.util.Arrays;

public class Exercise5 {
	public static void main(String[] args) {
		int[] list1 = {1,2,3};
		int[] list2 = {4,5,6,7,8};
		append(list1,list2);
	}
	
	public static void append(int[] first, int[] second) {
		int[] list3 = new int[first.length+second.length];
		for (int i=0; i<list3.length-second.length; i++) {
			list3[i] = first[i];
		}
      	int count = 0;
		for (int i=list3.length-second.length; i<list3.length; i++) {
			list3[i] = second[count];
          	count++;
		}
		System.out.println(Arrays.toString(list3));
	}
}