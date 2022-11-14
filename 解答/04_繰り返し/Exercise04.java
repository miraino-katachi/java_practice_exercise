import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int wins = 0;	// 勝ち数カウント

		for (int i = 0; i < 10; i++) {
			// 勝ち(1)/負け(0) 入力
			int result = Integer.parseInt(br.readLine());

			// 勝ち(1)の場合は勝ち数を1増やす
			if (result == 1) {
				wins += 1;
			}
		}

		// 引き分けは無いので、負け数 = 10 - 勝ち数
		System.out.println("勝ち" + wins + "回、負け" + (10 - wins) + "回");

		// 補足：勝ち数(1)のみカウントしているため、"1"以外の入力は負けの扱い
	}

}
