import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		if ((x % 2) == 0) {		// 偶数の場合
			// 正負判定
			if (x >= 0) {
				System.out.println("正の偶数");
			} else {
				System.out.println("負の偶数");
			}
		} else {				// 奇数の場合
			// 正負判定
			if (x >= 0) {
				System.out.println("正の奇数");
			} else {
				System.out.println("負の奇数");
			}
		}


		// 別解
		String posNeg = "正";		// 正負表示:仮に"正"としておく
		String oddEven = "奇数";	// 偶奇表示:仮に"奇数"としておく

		// 負の判定:負であれば表示を"負"にする
		if (x < 0) posNeg = "負";

		// 偶数の判定:偶数であれば表示を"偶数"にする
		if (x % 2 == 0) oddEven = "偶数";

		System.out.println(posNeg + "の" + oddEven);
	}

}
