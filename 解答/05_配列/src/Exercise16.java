import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Exercise16 {
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> array=new ArrayList<Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str = br.readLine();
			int n = Integer.parseInt(str);
			if (n == 0) {
				break;
			}

			int i = 0;
			for (i = 0; i < array.size(); i++) {
				if(n < array.get(i)) {
					array.add(i, n);
					break;
				}
			}
			if (i == array.size()) {
				array.add(n);
			}

			for(int a:array) {
				System.out.print(a+" ");
			}
			System.out.println();
		}

//		while(true){
//			String str=br.readLine();
//			int n=Integer.parseInt(str);
//			if(n==0) {
//				break;
//			}
//			array.add(n);
//			Collections.sort(array);
//			for(int a:array) {
//				System.out.print(a+" ");
//			}
//			System.out.println();
//		}
	}
}
