import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise10 {
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> array = new ArrayList<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 入力値を格納していく処理
		while (true) {
			int value = Integer.parseInt(br.readLine());

			// 0が入力されたら終了
			if (value == 0) {
				break;
			}

			// 入力値をリストへ追加
			array.add(value);
		}

		// リストをソート
		Collections.sort(array);


		System.out.println();


		// 格納された値を表示する処理

		// 一の位が0～9を順に表示
		for (int j = 0; j <= 9; j++) {

			// 一の位の数(j)にあたる数がリストにあったかどうかのフラグ
			// true:数字があった、false:数字が無かった、とする
			boolean exist = false;

			System.out.print("一の位が" + j + ":");
			// 入力された数字を順に確認
			for (int i = 0; i < array.size(); i++) {
				int value = array.get(i);

				// 一の位が同じ数字があれば表示してフラグを立てる(trueにする)
				if (value % 10 == j) {
					System.out.print(value + " ");
					exist = true;
				}
			}

			if (exist) {
				// 一の位が同じ数字があり、数字を表示していれば改行だけ行う
				System.out.println();
			} else {
				// 数字が無ければ「なし」を表示してから改行を行う
				System.out.println("なし");
			}
		}

	}

}
