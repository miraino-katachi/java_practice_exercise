import java.util.Random;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		Random random = new Random();

		// 配列に乱数の値を代入
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(10);
			}
		}

		// 配列の値を表示
		// 拡張for文使用でも可
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();


		int max = matrix[0][0];		// 最大値 (配列[0][0]の値を仮の最大値としておく)
		int min = matrix[0][0];		// 最小値 (配列[0][0]の値を仮の最小値としておく)
		// 配列の値は0～9であるので、初期値を0, 9にしても可
		/*
		int max = 0;
		int min = 9;
		*/

		// 配列の値を順に確認し、最大値・最小値を探す
		// 拡張for文使用でも可
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// 最大値のチェック
				if (max < matrix[i][j]) {
					max = matrix[i][j];
				}

				// 最小値のチェック
				if (min > matrix[i][j]) {
					min = matrix[i][j];
				}
			}
		}

		System.out.println("最大値:" + max);
		System.out.println("最小値:" + min);
	}

}
