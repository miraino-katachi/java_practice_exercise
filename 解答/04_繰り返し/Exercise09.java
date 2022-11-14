import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise09 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());

		// iは表示回数、outは表示する数値
		for (int i = 0, out = 0; i < count; i++) {
			System.out.print(out);
			out++;
			// 上記2行をまとめて1行でも記述可	System.out.print(out++);

			// outが9を超えたら(この場合は10になったら)、0に戻す
			if (out > 9) {
				out = 0;
			}
		}
		System.out.println();

		/*
		 * 別解
		 * 表示する数字 = 表示回数の1桁目 であるため、
		 * 10で割った余り(=1桁目の数字)を表示すればいい
		 */
		System.out.println();
		System.out.println("別解");
		for (int i = 0; i < count; i++) {
			System.out.print(i % 10);
		}
	}

}
