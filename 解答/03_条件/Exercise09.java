import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise09 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("中間試験=");
		int score1 = Integer.parseInt(br.readLine());
		System.out.print("期末試験=");
		int score2 = Integer.parseInt(br.readLine());

		if (score1 >= 60 && score2 >= 60) {
			// 両方とも60以上
			System.out.println("合格");
		} else if ((score1 + score2) >= 130) {
			// 合計が130以上
			System.out.println("合格");
		} else if ((score1 + score2) >= 100 && (score1 >= 90 || score2 >= 90)) {
			// 合計100以上、かつどちらかが90以上
			System.out.println("合格");
		} else {
			// それ以外
			System.out.println("不合格");
		}
	}

}
