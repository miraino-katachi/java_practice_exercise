import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int values[] = new int[10];
		int cnt, sum;

		// 入力回数(cnt)が10未満かつ合計(sum)が100以下の場合にループ続行
		for (cnt = 0, sum = 0; cnt < 10 && sum <= 100; cnt++) {
			values[cnt] = Integer.parseInt(br.readLine());
			sum += values[cnt];
		}

		// 表示は入力された回数まで
		for (int i = 0; i < cnt; i++) {
			System.out.println(values[i]);
		}

		System.out.println();


		// 別解：while使用例
		System.out.println();
		System.out.println("別解");

		int valuesOther[] = new int[10];
		int cntOther = 0, sumOther = 0;

		// 入力回数が10未満かつ合計が100以下の場合にループ続行
		while (cntOther < 10 && sumOther <= 100) {
			valuesOther[cntOther] = Integer.parseInt(br.readLine());
			sumOther += valuesOther[cntOther++];
		}

		for (int i = 0; i < cntOther; i++) {
			System.out.println(valuesOther[i]);
		}
	}

}
