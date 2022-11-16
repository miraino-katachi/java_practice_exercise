
public class Exercise01 {

	/*
	 * 検証処理
	 */
	public static void main(String[] args) {
		System.out.println("3の2乗=" + pow2(3));
		System.out.println("7の2乗=" + pow2(7));
	}

	/*
	 * 引数の2乗の値を返す
	 * 補足：staticがついているmain()メソッドから呼び出されるメソッドのため、
	 * このメソッドにはstaticが必要
	 */
	static int pow2(int n) {
		return n * n;
	}

}
