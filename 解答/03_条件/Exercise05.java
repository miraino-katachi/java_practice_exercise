import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		// 2で割った余りが0であれば偶数
		if ((x % 2) == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}
	}

}
