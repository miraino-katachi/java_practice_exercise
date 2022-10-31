import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("あなたの年齢は？");
		int age = Integer.parseInt(br.readLine());

		// 1年(365日) * 年齢でおおよその日数を計算
		System.out.println("生まれてから今まで、およそ" + (age * 365) + "日です");
	}

}
