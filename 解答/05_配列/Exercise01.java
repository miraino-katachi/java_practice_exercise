import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int values[] = new int[10];

		// 入力値を配列へ代入、を10回(配列要素数分)繰り返す
		for (int i = 0; i < values.length; i++) {
			values[i] = Integer.parseInt(br.readLine());
		}

		// 配列各要素の2倍を表示
		for (int n : values) {
			System.out.println(n * 2);
		}
	}

}
