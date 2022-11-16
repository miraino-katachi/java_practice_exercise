
public class Exercise08 {

	public static void main(String[] args) {

		// バナー上、文字列、バナー下の計3行なので3回ループ
		for (int i = 0; i < 3; i++) {

			if (i == 0 || i == 2) {
				// 1行目、3行目は囲み文字を表示
				// 文字表示数は
				// 「与えられた文字列の長さ」 +「左右の囲み文字(2つ) + 空白(2つ)」
				for (int j = 0; j < args[0].length() + 4; j++) {
					System.out.print("+");
				}
			} else {
				// 1行目、3行目以外(=2行目)は囲み文字 + 与えられた文字列を表示
				System.out.print("+ ");		// 左側囲み
				System.out.print(args[0]);	// 文字列
				System.out.print(" +");		// 右側囲み
			}

			System.out.println();
		}

	}

}
