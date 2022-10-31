import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("あなたの名前は？");
		String name = br.readLine();

		System.out.println("あなたの名前のふりがなは？");
		String huriName = br.readLine();

		System.out.println("あなたの住所は？");
		String address = br.readLine();

		System.out.println("名前：" + name);
		System.out.println("ふりがな：" + huriName);
		System.out.println("住所：" + address);
	}

}
