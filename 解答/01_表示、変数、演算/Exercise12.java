
public class Exercise12 {

	public static void main(String[] args) {
		int x = 10;

		// インクリメント (+1)
		x++;
		System.out.println("x = " + x);

		// デクリメント (-1)
		// ※インクリメント1回 => デクリメント1回だと元の値に戻ってしまうので、
		// 念のため2回デクリメントして演算が正常に行われているか確認
		x--;
		x--;
		System.out.println("x = " + x);

		// println内でインクリメント・デクリメントする場合、演算子前置で記述する必要がある
		// 演算子後置では「値評価→インクリメント/デクリメント」になるため、意図した通りの結果とならない
		System.out.println("----------");
		System.out.println("x = " + x);
		System.out.println("x = " + (++x));
		System.out.println("x = " + (--x));
	}

}
