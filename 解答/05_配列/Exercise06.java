import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 社員番号、社員名の配列を用意
		int[] employNumbers = { 1001, 1002, 1005, 1010, 1012, 1013, 1015, 1020, 1021, 1022 };
		String[] employNames = { "鈴木", "井上", "山本", "田川", "田中", "松本", "木下", "上野", "岡本", "吉永" };

		// 番号入力
		int employ_number = Integer.parseInt(br.readLine());

		// 社員番号の配列を前から順に比較し、入力された番号が配列の何番目か(要素番号)を探す
		// 社員名の配列から、探した要素番号の名前を表示する
		for (int i = 0; i < 10; i++) {
			if (employ_number == employNumbers[i]) {
				System.out.println("社員番号" + employ_number + "は" + employNames[i] + "さんです");
				break;
			}
		}
	}

}
