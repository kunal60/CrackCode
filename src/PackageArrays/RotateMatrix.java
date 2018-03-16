package PackageArrays;

//Not done yet
public class RotateMatrix {

	public static void main(String[] args) {
		int array[][] = new int[4][4];

		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 3;
		array[0][3] = 4;

		array[1][0] = 5;
		array[1][1] = 6;
		array[1][2] = 7;
		array[1][3] = 8;

		array[2][0] = 9;
		array[2][1] = 10;
		array[2][2] = 11;
		array[2][3] = 12;

		array[3][0] = 13;
		array[3][1] = 14;
		array[3][2] = 15;
		array[3][3] = 16;
		System.out.println("Input:");
		printMatrix(array);
		System.out.println("************************");
		System.out.println("Output:");

	}

	public static void rotateMatrix(int array[][]) {

		int matrix[][]= array; 
		if (matrix.length > 0 && matrix.length == matrix[0].length) {
			int n= matrix.length;
			
			int temp[] = matrix[0];
			
			
			
			

		}

	}

	private static void printMatrix(int[][] array) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				System.out.print((array[i][j] < 10 ? array[i][j] + " " : array[i][j]) + "|");
			}
			System.out.println();

		}

	}

}
