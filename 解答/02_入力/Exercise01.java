import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 入力された文字列を変数strへ代入
		String str = br.readLine();

		System.out.println(str);
	}

}
