import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise08 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			System.out.print("*");
		}
		System.out.println();


		// while文を使用した別解
		System.out.println();
		System.out.println("別解");
		while (count > 0) {
			System.out.print("*");
			count--;
		}
	}

}
