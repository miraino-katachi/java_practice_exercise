import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise08_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int score = Integer.parseInt(br.readLine());

		// 0未満 or 101以上はエラー
		if (score < 0 || 100 < score) {
			System.out.println("エラーです");
			return;
		}

		if (score >= 80) {
			// 80以上(100以下)
			System.out.println("優");
		} else if (score >= 70) {
			// 70以上(80未満)
			System.out.println("良");
		} else if (score >= 60) {
			// 60以上(70未満)
			System.out.println("可");
		} else {
			// それ以外
			System.out.println("不可");
		}
	}

}
