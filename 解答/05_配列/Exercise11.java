import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Exercise11 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> array = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 入力値を格納していく処理
		while (true) {
			String str = br.readLine();

			// 空文字が入力されたら終了
			if ("".equals(str)) {
				break;
			}

			// 入力文字列をリストへ追加
			array.add(str);
		}

		System.out.println();

		// 入力文字列を順に表示
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + " ");
		}

		System.out.println();


		// 拡張for文を使っても可
		System.out.println();
		System.out.println("拡張for文での表示");
		for (String s : array) {
			System.out.print(s + " ");
		}
	}

}
