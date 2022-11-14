import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int maxValue = 0, minValue = 0;

		for (int i = 0; i < 10; i++) {
			int value = Integer.parseInt(br.readLine());

			if (i == 0) {
				// 正負どちらの整数も入力対象になるため、
				// 初回の入力値はmaxValue, minValueに代入しておく
				maxValue = value;
				minValue = value;
			} else {
				// 最大値判定
				if (value > maxValue) {
					maxValue = value;
				}

				// 最小値判定
				if (value < minValue) {
					minValue = value;
				}
			}
		}

		System.out.println("最大値=" + maxValue + " 最小値=" + minValue);


		/* 別解
		 * 上記ではmaxValue, minValueの初期値をを0にしているため、
		 * 初回かどうか(i == 0)を判断し、初回値をmaxValue, minValueに代入している
		 *
		 * maxValueをintの最小値、minValueをintの最大値、として初期値にしておけば、
		 * 初回入力の値は必ず最大値判定、最小値判定の条件に合致し、
		 * maxValue, minValueへの代入が必ず行われるため、
		 * 初回かどうかの判断が不要になる
		 */
		int maxValueOtherAns = Integer.MIN_VALUE;	// int最小値を入れておく
		int minValueOtherAns = Integer.MAX_VALUE;	// int最大値を入れておく
		for (int i = 0; i < 10; i++) {
			int value = Integer.parseInt(br.readLine());

			// 最大値判定
			if (value > maxValueOtherAns) {
				maxValueOtherAns = value;
			}

			// 最小値判定
			if (value < minValueOtherAns) {
				minValueOtherAns = value;
			}
		}

		System.out.println("最大値=" + maxValueOtherAns + " 最小値=" + minValueOtherAns);
	}

}
