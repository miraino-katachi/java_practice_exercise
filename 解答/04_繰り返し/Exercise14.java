
public class Exercise14 {

	public static void main(String[] args) {
		// 段(かけられる数) 1～9
		for (int x = 1; x <= 9; x++) {

			// 列(かける数) 1～9
			for (int y = 1; y <= 9; y++) {
				// 桁を揃えるために[%2d](2桁数字空白埋め)で表示
				System.out.printf(" %2d", x * y);

				// タブ区切りや空白区切りでも可
				// System.out.print( (x * y) + "\t");
				// System.out.print( (x * y) + " ");
			}

			System.out.println();
		}
	}

}
