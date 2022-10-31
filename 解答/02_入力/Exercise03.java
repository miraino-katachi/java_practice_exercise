import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());

		System.out.println(x);
		System.out.println(x * x);
		System.out.println(x * x * x);

		System.out.println("Math.pow()を使用");
		System.out.println(Math.pow(x, 1));
		System.out.println(Math.pow(x, 2));
		System.out.println(Math.pow(x, 3));
	}

}