package PackageArrays;

public class MbyNMatrix {

	public static void main(String[] args) {

		int array[][] = new int[3][3];

		array[0][0] = 1;
		array[0][1] = 1;
		array[0][2] = 1;

		array[1][0] = 0;
		array[1][1] = 1;
		array[1][2] = 1;

		array[2][0] = 1;
		array[2][1] = 0;
		array[2][2] = 1;
		System.out.println("Input:");
		PrintMatrix(array);
		System.out.println("**********");
		zerofyMatrix(array);
	}

	static void zerofyMatrix(int[][] matrix) {

		boolean rowTracker[] = new boolean[matrix.length];
		boolean colTracker[] = new boolean[matrix[0].length];

		System.out.println("Output:");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					rowTracker[i] = true;
					colTracker[j] = true;
				}
			}

		}

		for (int i = 0; i < rowTracker.length; i++) {
			if (rowTracker[i] == true) {
				for (int j = 0; j < colTracker.length; j++) {
					matrix[i][j] = 0;
				}
			}

		}

		for (int i = 0; i < colTracker.length; i++) {
			if (colTracker[i] == true) {
				for (int j = 0; j < rowTracker.length; j++) {
					matrix[j][i] = 0;
				}
			}

		}

		PrintMatrix(matrix);

	}

	private static void PrintMatrix(int[][] array) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j] + "|");
			}
			System.out.println();

		}

	}

}
