import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int values[] = new int[10];

		for (int i = 0; i < 10; i++) {
			values[i] = Integer.parseInt(br.readLine());
		}

		/*
		 * 並べ替え(ソート)処理の考え方
		 *
		 * 0番目と1番目を比較し、0番目の方が大きければ入れ替え
		 * 0番目と2番目を比較し、0番目の方が大きければ入れ替え
		 * 	・・・
		 * 0番目と9番目を比較し、0番目の方が大きければ入れ替え ← 0番目が最も小さい数になる
		 *
		 *
		 * 1番目と2番目を比較し、1番目の方が大きければ入れ替え
		 * 	・・・
		 * 1番目と9番目を比較し、0番目の方が大きければ入れ替え ← 1番目が次に小さい数になる
		 *
		 *
		 * 以上の処理を繰り返す(i番目とj番目を比較し、i番目の方が大きければ入れ替え)
		 *
		 * この方法以外にも、ソート処理はいくつか種類があります
		 */
		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (values[i] > values[j]) {
					int t = values[i];
					values[i] = values[j];
					values[j] = t;
				}
			}
		}

		// 配列表示
		for (int n : values) {
			System.out.print(n + " ");
		}
	}

}
