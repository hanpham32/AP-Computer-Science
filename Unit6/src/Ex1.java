import java.util.ArrayList;
import java.util.Arrays;

public class Ex1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("the", "quick", "brown", "fox"));
		addStars(list);
	}
	
	public static void addStars(ArrayList<String> list) {
		for (int i = 1; i <= list.size(); i+=2) {
			list.add(i, "*");
		}
		System.out.println(list);
	}
	
	public static void removeStars(ArrayList<String> list) {
		for (int i=0; i<=list.size(); i++) {
		}
	}
}
