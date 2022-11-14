import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise10_ex {
	public static void main(String[] args) throws IOException {
		// 設問10 別解

		/*
		 * ArrayListを2次元配列のように使用する
		 * list 0番目 => 一の位が0の数字を保存するArrayList
		 * list 1番目 => 一の位が1の数字を保存するArrayList
		 * ・・・
		 *
		 * データを保持するイメージ
		 * [
		 *   [一の位が0の数のリスト],
		 *   [一の位が1の数のリスト],
		 *   ・・・・
		 *   [一の位が9の数のリスト]
		 * ]
		 *
		 * Exercise10.javaは、入力値を1つのリストに持っておき、表示の際に分ける、という考え方
		 * こちらでは、入力の際に分けて持っておき、表示の処理を少なくする、という考え方
		 */

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// listの各要素(0～9番目)をArrayListで初期化
		for (int i = 0; i < 10; i++) {
			list.add(new ArrayList<>());
		}

		// 入力値を格納していく処理
		while (true) {
			int value = Integer.parseInt(br.readLine());

			// 0が入力されたら終了
			if (value == 0) {
				break;
			}

			// 「一の位の数」番目のArrayListに入力された値を追加
			list.get(value % 10).add(value);

			// 以下の処理と同様
			// ArrayList<Integer> subList = list.get(value % 10);
			// subList.add(value);
		}


		System.out.println();

		// 格納された値を表示する処理

		int n = 0; // 表示する一の位の値

		// listにある各ArrayListを順に取り出す
		// 0番目は一の位が0のリスト、1番目は一の位が1のリスト、・・・、
		// と格納しているため、前から順に取り出して表示するだけになる
		for (ArrayList<Integer> array : list) {
			System.out.print("1の位が" + n++ + ":");

			// 取り出したArrayListに要素がなければ該当数値無し
			if (array.size() == 0) {
				System.out.println("なし");
				// ループを継続(一の位の次の数字の処理へ)
				continue;
			}

			// (小さい順に表示したいため)取り出したArrayListをソート
			Collections.sort(array);

			// 該当数値を順に表示
			for (int value : array) {
				System.out.print(value + " ");
			}
			System.out.println();
		}

	}

}
