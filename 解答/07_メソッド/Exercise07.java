
public class Exercise07 {

	/*
	 * 検証処理
	 */
	public static void main(String[] args) {
		for (int n = 10000; n < 10100; n++) {
			if (isPrimeNumber(n)) System.out.print(n + " ");
		}
	}

	/*
	 * 引数の値が素数の場合にtrueを返す
	 * 素数判定処理は問題04 設問12 参照
	 */
	static boolean isPrimeNumber(int num) {
		for (int i = 2; i <= (num / 2); i++) {
			// 割り切れた場合は素数ではない
			if ((num % i) == 0) return false;
		}

		// ループから抜けた = 割り切れなかったので素数
		return true;
	}
}
