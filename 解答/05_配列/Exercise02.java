import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int values[] = new int[10];

		// 要素数10の配列に値を代入
		for (int i = 0; i < values.length; i++) {
			values[i] = Integer.parseInt(br.readLine());
		}

		// 数値入力ではなく配列初期化で用意しても可
		// int values[] = {25, 24, 0, 36, 16, 14, 15, 5, 35, 4};


		// 配列を逆から表示
		for (int i = values.length - 1; i >= 0; i--) {
			System.out.println(values[i]);
		}
	}

}
