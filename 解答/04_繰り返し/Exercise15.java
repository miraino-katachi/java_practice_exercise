import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise15 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;

		// 終了条件指定しない = 無限ループ
		// while (true) でも同様
		for ( ; ; ) {
			int value = Integer.parseInt(br.readLine());

			// 0入力でループ終了
			if (value == 0) {
				break;
			}

			sum += value;
		}

		System.out.println("合計は" + sum);


		/*
		 * 別解
		 * whileの終了条件に「入力した値が0」としても可
		 */
		System.out.println();
		System.out.println("別解");

		int valueOther = -1;	// 入力値=0がループ終了条件なので、初期値は0以外にしておく
		int sumOther = 0;

		// 0が入力されたら終了 (0でない場合は合計に加える処理を実行)
		while (valueOther != 0) {
			valueOther = Integer.parseInt(br.readLine());
			sumOther += valueOther;
		}

		System.out.println("合計は" + sumOther);
	}

}
