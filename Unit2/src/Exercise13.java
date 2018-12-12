import java.util.StringTokenizer;

public class Exercise13 {
	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer(" Now, is, a good time, to get this done", ",");
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
	}
	
}