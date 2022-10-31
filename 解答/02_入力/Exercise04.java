import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		System.out.println("和" + (x + y));
		System.out.println("差" + (x - y));
		System.out.println("積" + (x * y));
		System.out.println("商" + (x / y));
		System.out.println("余り" + (x % y));
		System.out.println("商(double)" + ((double) x / y) );

		/*
		 * 補足
		 * double z = x / y; もしくは
		 * System.out.println( (double) (x / y) );
		 * などの記述にすると、まず「x / y」の計算がint型(整数型=小数点以下切り捨て)で行われ、
		 * 計算後にdouble型への変換が行われる
		 * 例えば、double z = 5 / 2; の結果は z = 2.0となる
		 *
		 * double型で計算する場合は、double型に変換してから計算する
		 * double z = (double)x / y;  ← xをdouble型に変換して計算
		 */
	}

}
