import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Exercise12 {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> array = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 入力値を格納していく処理
		while (true) {
			String str = br.readLine();
			int n = Integer.parseInt(str);

			// 0が入力されたら終了
			if (n == 0) {
				break;
			}

			array.add(n);
		}


		// 2を削除する処理
		int index = 0;
		// 要素が「2」のインデックス(要素番号)を検索し、
		// 「2」がある(=インデックスが0以上)場合は削除
		while ( (index = array.indexOf(2)) >= 0 ) {
			array.remove(index);
		}

		// ArrayListの中身を順に表示
		System.out.println();
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + " ");
		}


		/*
		 * 補足
		 * ArrayListは要素を削除remove()すると後ろの要素が前に詰められるので、
		 * remove()するたびにindex(要素番号)が変わります
		 * そのため、下記のように前から順に「要素を見て削除」の処理にすると、
		 * 適切に処理されない、もしくはエラーが発生します
		 */

		// 2が連続で入力されていた場合に適切に処理されない
		/*
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) == 2) {
				array.remove(i);
			}
		}
		 */


		// 拡張for文でremove()するとエラーが発生する
		/*
		int index = 0;
		for (int value : array) {
			if (value == 2) array.remove(index);
			index++;
		}
		 */


		/*
		 * 適切に処理するにはIteratorを使用する、removeIf()を使用するなどがあります
		 * 単純な条件であればremoveIf()が簡潔に記述できますが、
		 * 複数条件・複雑な条件の場合はIteratorを使用こともあります
		 */

		/*
		 * removeIf()を使用(ラムダ式による条件指定)
		 * 条件に合致する要素を削除する
		 */
		/*
		array.removeIf(value -> value == 2);	// 条件(値が2)に合致する要素を削除
		*/

		/*
		 * Iteratorを使用
		 * ※import java.util.Iterator; 宣言が必要
		 */
		/*
		Iterator<Integer> it = array.iterator();
		while (it.hasNext()) {		// hasNext() => 次の要素があるかチェックする
			int n = it.next();		// next() => 次の要素へ進み、要素を取り出す
			if (n == 2) {
				it.remove();		// remove() => 現在位置の要素を削除
			}
		}
		*/
	}

}
