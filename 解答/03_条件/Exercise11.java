import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("お好きな寿司を選んでください");
		System.out.println("1:まぐろ 2:えび 3:こはだ 4:あなご 5:いくら");

		int sushi = Integer.parseInt(br.readLine());

		switch (sushi) {
			case 1:
				System.out.println("何か良いことがあります。");
				break;
			case 2:
				System.out.println("驚くほど良いことがあります。");
				break;
			case 3:
				System.out.println("ちょっと良いことがあります。");
				break;
			case 4:
				System.out.println("とても良いことがあります。");
				break;
			case 5:
				System.out.println("そこそこ良いことがあります。");
				break;
		}
	}

}
