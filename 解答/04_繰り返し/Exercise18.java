
public class Exercise18 {

	public static void main(String[] args) {
		int n1 = 0;			// 表示する項
		int n2 = 1;			// 次項
		int n3 = n1 + n2;	// 次々項は前2項の和

		// 表示する項が1000以下の間は計算を続ける
		while (n1 <= 1000) {
			System.out.print(n1 + ",");

			// 1項目←2項目、2項目←3項目にずらす
			n1 = n2;
			n2 = n3;

			// 3項目を計算
			n3 = n1 + n2;
		}
	}

}
