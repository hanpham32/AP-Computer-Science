import java.lang.reflect.Array;

public class Exercise6 {
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{1,2,3}};
		int[][] b = {{1,1,1}, {1,1,1}};
		matrixAdd(a,b);
	}
	
	public static void matrixAdd(int[][] a, int[][]b) {
		int r = a.length;
		int c = a[0].length;
		
		int[][] z = new int[r][c];
		
		for (int rows=0; rows<r; rows++) {
			for (int col=0; col<c; col++) {
				z[rows][col] = a[rows][col] + b[rows][col];
			}
		}
		
		for (int i=0; i<z.length; i++) {
			for (int j=0; j<z[0].length; j++) {
				System.out.print(z[i][j] + " ");
			}
			System.out.println();
		}
	}
}
