import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int value = Integer.parseInt(br.readLine());
		boolean isPrimeNumber = true;		// 素数かどうかのフラグ(素数=trueの扱い)

		// 入力値を、2から順番に割り切れるか確認する
		for (int n = 2; n <= (value / 2); n++) {
			// 割り切れた(=素数ではない)場合、素数フラグをfalseにし、確認を途中で止める
			if ( ( value % n ) == 0 ) {
				isPrimeNumber = false;
				break;
			}
		}

		if (isPrimeNumber) {
			System.out.println(value + "は素数です");
		} else {
			System.out.println(value + "は素数ではありません");
		}


		// 別解
		// 割り切れた場合、ループ途中で素数でないと表示して処理を終了させる、でも可
		for (int i = 2; i < (value / 2); i++) {
			if ( ( value % i ) == 0 ) {
				System.out.println(value + "は素数ではありません (別解)");
				return;
			}
		}

		// ループから抜けた => 割り切れなかった => 素数
		System.out.println(value + "は素数です (別解)");


		/*
		 * 補足
		 * ループの終了条件は n < value でも可
		 * ただし数字は、その数字の半分(÷2)よりも大きい数では絶対に割り切れないため、
		 * 上記では終了条件を n <= (value / 2)として、計算量を減らしている
		 *
		 * 例) 12の場合：半分(6)より大きい数では割り切れることはない
		 * 例) 25の場合：半分(12)より大きい数では割り切れることはない
		 */
	}

}
