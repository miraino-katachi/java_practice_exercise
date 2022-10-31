
public class Exercise07 {

	public static void main(String[] args) {
		// x, y, zを宣言、zは入れ替え処理用
		int x, y, z;

		// x, y に値代入
		x = 3;
		y = 7;

		z = x;	// xの値を退避させておく
		x = y;	// xにyの値を代入
		y = z;	// yに退避させておいたxの値(z)を代入

		System.out.println("x=" + x + ",y=" + y);
	}

}
