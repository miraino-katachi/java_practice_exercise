import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		if (1 <= num && num <= 3 | 7 <= num && num <= 9) {
			System.out.println("当たり");
		} else if (10 < num) {
			System.out.println("やり直してください");
		} else {
			System.out.println("はずれ");
		}
	}

}
