import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		CoinCase myCase = new CoinCase();

		// 硬貨の追加を10回行う
		for (int i = 0; i < 10; i++) {
			System.out.print("硬貨の種類は?");
			int kind = Integer.parseInt(br.readLine());
			System.out.print("硬貨の枚数は?");
			int count = Integer.parseInt(br.readLine());

			myCase.addCoins(kind, count);

			System.out.println();
		}

		// 各硬貨の枚数を表示
		System.out.println("500円は" + myCase.getCount(500) + "枚");
		System.out.println("100円は" + myCase.getCount(100) + "枚");
		System.out.println("50円は" + myCase.getCount(50) + "枚");
		System.out.println("10円は" + myCase.getCount(10) + "枚");
		System.out.println("5円は" + myCase.getCount(5) + "枚");
		System.out.println("1円は" + myCase.getCount(1) + "枚");
		System.out.println();
		// 総額を表示
		System.out.println("総額は" + myCase.getAmount() + "円");
	}

}
