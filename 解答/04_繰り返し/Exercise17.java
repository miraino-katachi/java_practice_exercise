import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise17 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		// 指定数だけ 行をループ
		for (int i = 0; i < size; i++) {

			// 各行で指定数だけ文字を表示
			for (int j = 0; j < size; j++) {
				System.out.print("$");
			}

			// 各行の最後に改行
			System.out.println();
		}
	}

}
