import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		/*
		 * 素因数分解の方法
		 * (1) 2から順に素数で割っていく
		 * (2) 1つの素数について割り切れなくなるまで繰り返し割る
		 * (3) 割れなくなったら次の素数で繰り返し割る
		 * (4) 答えが1になれば終了
		 *
		 * ただし、割る数を厳密に素数だけにしてしまうと、
		 * 前問(12)のような素数判定が必要になり、余計な処理が増えてしまうため、
		 * 下記処理では割る数(x)は単純に1ずつ増やして判定している
		 */

		// 2から順に割り切れるか判定
		// 終了条件は割った答えが1になるまで
		for (int x = 2; n > 1; x++) {

			// 同じ数字で何度も割れる可能性があるので、
			// 割り切れなくなるまで繰り返す
			while ((n % x) == 0) {
				// 割れる場合は素因数(割った数)を表示
				System.out.print(x + " ");

				// 割った結果をnに入れておく
				n /= x;
			}
		}

	}

}
