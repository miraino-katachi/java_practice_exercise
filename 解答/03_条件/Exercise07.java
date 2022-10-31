import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// スーパーの状態 (開店:true/閉店:false)
		boolean isOpen = true;

		if (isOpen) {
			// スーパーが開店している

			// りんご・みかんの値段入力
			System.out.println("りんごの値段は？");
			int apple = Integer.parseInt(br.readLine());
			System.out.println("みかんの値段は？");
			int orange = Integer.parseInt(br.readLine());

			// 安い方を購入
			if (orange > apple) {
				System.out.println("りんご購入");
			} else if (apple > orange) {
				System.out.println("みかん購入");
			}
		} else {
			// スーパーが閉店している
			System.out.println("家に帰る");
		}

	}

}
