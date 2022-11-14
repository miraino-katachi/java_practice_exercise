
public class Exercise07 {

	public static void main(String[] args) {
		int[][] matrix = new int[3][3];

		// 二次元配列に値を代入
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = 1 + i * matrix[i].length + j;
			}
		}

		// 以下のように値を初期化しても可
		// int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


		// 二次元配列を表示
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}


		// 拡張for文を使っても可
		System.out.println();
		System.out.println("拡張for文での表示");
		for (int[] array : matrix) {
			for (int value : array) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}

}
