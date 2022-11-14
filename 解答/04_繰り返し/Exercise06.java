import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int maxValue = 0;

		for (int i = 0; i < 10; i++) {
			int value = Integer.parseInt(br.readLine());

			// 入力値(value)がこれまでの最大値(maxValue)より大きければ最大値を置き換え
			if (value > maxValue) {
				maxValue = value;
			}
		}

		System.out.println("最大値=" + maxValue);
	}

}
