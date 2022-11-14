import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Exercise09 {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> even = new ArrayList<Integer>(); // 偶数用リスト
		ArrayList<Integer> odd = new ArrayList<Integer>(); // 奇数用リスト

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str = br.readLine();
			int value = Integer.parseInt(str);

			// 0が入力されたら終了
			if (value == 0) {
				break;
			}

			// 偶数奇数を判定して、それぞれのリストへ追加
			if (value % 2 == 0) {
				even.add(value);
			} else {
				odd.add(value);
			}
		}

		System.out.println();

		// 偶数表示
		System.out.print("偶数：");
		for (int i = 0; i < even.size(); i++) {
			System.out.print(even.get(i) + " ");
		}

		System.out.println();

		// 奇数表示
		System.out.print("奇数：");
		for (int i = 0; i < odd.size(); i++) {
			System.out.print(odd.get(i) + " ");
		}

		System.out.println();


		// ArrayListでも配列同様に拡張for文の使用が可能
		System.out.println();
		System.out.println("表示別解");
		// 偶数表示
		System.out.print("偶数：");
		for (int value : even) {
			System.out.print(value + " ");
		}

		System.out.println();

		// 奇数表示
		System.out.print("奇数：");
		for (int value : odd) {
			System.out.print(value + " ");
		}
	}

}
