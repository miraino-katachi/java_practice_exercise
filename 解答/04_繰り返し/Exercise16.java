import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise16 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		int count = 0;

		for ( ; ; ) {
			int value = Integer.parseInt(br.readLine());

			if (value == 0) {
				break;
			}

			sum += value;	// 合計値に追加
			count++;		// 入力回数を増やす
		}

		System.out.println("平均は" + (sum / count));
	}

}
