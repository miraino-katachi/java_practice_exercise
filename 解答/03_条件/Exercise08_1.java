import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise08_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int score = Integer.parseInt(br.readLine());

		// 0未満 or 101以上はエラー
		if (score < 0 || 100 < score) {
			System.out.println("エラーです");
			return;		// System.exit(0); でも可
		}

		if (score >= 60) {
			// 60以上(100以下)
			System.out.println("合格");
		} else {
			// それ以外
			System.out.println("不合格");
		}
	}

}
