import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int values[] = new int[10];

		for (int i = 0; i < values.length; i++) {
			values[i] = Integer.parseInt(br.readLine());
		}

		// 偶数のみ表示
		System.out.print("偶数:");
		for (int n : values) {
			if ((n % 2) == 0) {
				System.out.print(n + " ");
			}
		}

		// 改行
		System.out.println();

		// 奇数のみ表示
		System.out.print("奇数:");
		for (int n : values) {
			if ((n % 2) != 0) {
				System.out.print(n + " ");
			}
		}
	}

}
