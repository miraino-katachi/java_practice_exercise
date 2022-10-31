import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		if (num < 1 || 9 < num) {
			// 1～9以外　やり直し
			System.out.println("やり直してください");
		} else if ( (1 <= num && num <= 3) || (7 <= num && num <= 9) ) {
			// 1以上3以下、もしくは7以上9以下　当たり
			System.out.println("当たり");
		} else {
			// それ以外　はずれ
			System.out.println("はずれ");
		}
	}

}
