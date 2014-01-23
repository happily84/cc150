package chapter1;
import java.util.Arrays;

public class Question7 {
	static void setZeroMatrix( int[][] matrix, int n) {
		boolean[][] checker = new boolean[2][n];
		for ( int i = 0; i < n; ++i) {
			checker[0][i] = false;
			checker[1][i] = false;
		}
		for ( int i = 0; i < n; ++i) {
			for ( int j = 0; j < n; ++j) {
				if(matrix[i][j] == 0 ) {
					checker[0][i] = true;
					checker[1][j] = true;
				}
			}
		}
		for ( int i = 0; i < n; ++i) {
			for ( int j = 0; j < n; ++j) {
				if( checker[0][i] == true || checker[1][j] == true ) {
					matrix[i][j] = 0;
				}
			}
		}
	}
	public static void main( String[] args ) {
		int[][] matrix = {
				{0,1,1,1},
				{1,1,0,1},
				{1,1,1,1},
				{1,0,1,1}
		};
		System.out.println(Arrays.deepToString(matrix));
		setZeroMatrix(matrix,4);
		System.out.println(Arrays.deepToString(matrix));
	}
}
