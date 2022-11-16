
public class Exercise09 {

	/*
	 * 検証処理
	 */
	public static void main(String[] args) {
		System.out.println("5! = " + factorial(5));
		System.out.println("6! = " + factorial(6));
	}

	/*
	 * 階乗を返す
	 *
	 * 階乗について
	 *
	 * n!       = n * (n - 1) * (n - 2) * ・・・ * 1
	 * (n - 1)! =     (n - 1) * (n - 2) * ・・・ * 1
	 *
	 * そのため、n! = n * (n - 1)! となる
	 */
	static int factorial(int n) {
		if (n == 0) return 1;				// 0! = 1
		else return n * factorial(n - 1);	// n! = n * (n - 1)!
	}

}
