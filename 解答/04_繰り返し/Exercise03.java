import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;

		// 10回入力し、入力値を順に加算して合計を計算する
		for (int i = 0; i < 10; i++) {
			int value = Integer.parseInt(br.readLine());
			sum += value;
		}

		System.out.println("平均は" + (sum / 10));
	}

}
