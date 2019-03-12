package Recursion;

public class Ex5 {
	public static void main(String[] args) {
		int[] array = {4,7,9,11,12,16,20,32,34};
		
		int index = binarySearch(array, 16, 0, array.length-1);
		System.out.println(index);
	}
	
	public static int binarySearch(int[] arr, int target, int min, int max) {
		int mid = (min+max) / 2;
		if (min > max) { 
			return -1; // Not found
		} else if (arr[mid] > target) {
			return binarySearch(arr, target, min, mid-1);
		} else if (arr[mid] < target) {
			return binarySearch(arr, target, mid+1, max);
		} else {
			return mid;
		}
	}
}
