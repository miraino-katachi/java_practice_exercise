import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 各チーム合計得点
		int giants = 0;
		int tigers = 0;

		// 1回～9回の各チーム得点を入力し、合計得点を計算
		for (int game = 1; game <= 9; game++) {
			System.out.print(game + "回表、巨人の得点は？");
			giants += Integer.parseInt(br.readLine());

			System.out.print(game + "回裏、阪神の得点は？");
			tigers += Integer.parseInt(br.readLine());
		}

		// 合計得点表示
		System.out.println("巨人：" + giants + "点, 阪神：" + tigers + "点");

		// 勝ちチーム表示
		if (giants > tigers) {
			System.out.println("巨人の勝ち");
		} else if (giants < tigers) {
			System.out.println("阪神の勝ち");
		} else {
			System.out.println("引き分け");
		}
	}

}
