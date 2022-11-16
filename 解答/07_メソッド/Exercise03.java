import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise03 {

	/*
	 * 検証処理
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// x, y, zに数値を入力
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int z = Integer.parseInt(br.readLine());

		// 最も大きい数を表示
		System.out.println("最も大きい数=" + maxValue(x, maxValue(y, z)));
	}

	/*
	 * 大きい方の数を返す
	 */
	static int maxValue(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}

		/*
		 * if - elseの代わりに三項演算子(条件演算子)を使用して
		 * 1行で記述する例
		 * return (n1 > n2) ? n1 : n2;
		 */
	}

}
