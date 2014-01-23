package chapter1;

public class Question6 {
	public static void print(int[][] matrix, int n ) {
		for ( int i = 0; i < n; ++i) {
			for ( int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print('\n');
		}
	}
	public static int[][] rotateMatrix ( int[][] matrix, int N ) {
		for( int k = 0; k < N/2; ++k ) {
			for ( int w = k; w < N - k - 1; w++ ) {
				int tmp = matrix[k][w];
				matrix[k][w] = matrix[N-w-1][k];
				matrix[N-w-1][k] = matrix[N-k-1][N-w-1];
				matrix[N-k-1][N-w-1] = matrix[w][N-k-1];
				matrix[w][N-k-1] = tmp;
			}
		}
		return matrix;
	}
	public static void main( String[] args ) {
		int [][] Matrix = {
				{0,1,2,3,4,5},
				{0,1,2,3,4,5},
				{0,1,2,3,4,5},
				{0,1,2,3,4,5},
				{0,1,2,3,4,5},
				{0,1,2,3,4,5}
		};
		
		print(Matrix,5);
		System.out.println("otehr");
		print(rotateMatrix(Matrix,6),6);
	}
}
