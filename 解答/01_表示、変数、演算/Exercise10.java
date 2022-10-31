
public class Exercise10 {

	public static void main(String[] args) {
		int x = 5;

		System.out.println(x);			// 1乗
		System.out.println(x * x);		// 2乗
		System.out.println(x * x * x);	// 3乗

		// Javaでは累乗の演算子は用意されていない
		// 通常はMath.pow() を使用
		// 結果(戻り値)はdouble型
		System.out.println("Math.pow()を使用");
		System.out.println(Math.pow(x, 1));		// 1乗
		System.out.println(Math.pow(x, 2));		// 2乗
		System.out.println(Math.pow(x, 3));		// 3乗
	}

}
