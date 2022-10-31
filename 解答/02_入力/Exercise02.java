import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 入力された文字列をint型に変換して変数xへ代入
		int x = Integer.parseInt(br.readLine());

		System.out.println(x);
	}

}
