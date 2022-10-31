import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("x=");
		int x = Integer.parseInt(br.readLine());
		System.out.print("y=");
		int y = Integer.parseInt(br.readLine());

		if (x > y) {
			System.out.println("xはyより大きい");
		} else if (x < y) {
			System.out.println("xはyより小さい");
		}
	}

}
