import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Exercise09 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> even=new ArrayList<Integer>();
		ArrayList<Integer> odd=new ArrayList<Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String str=br.readLine();
			int value=Integer.parseInt(str);
			if(value==0) {
				break;
			}
			if(value%2==0) {
				even.add(value);
			}else {
				odd.add(value);
			}
		}

		System.out.println();
		System.out.print("偶数：");
		for(int i=0;i<even.size();i++) {
			System.out.print(even.get(i)+" ");
		}
		//拡張for文を使って以下のようにしても可
		/*
		for(int i:even) {
			System.out.print(i+" ");
		}
		*/

		System.out.println();

		System.out.print("奇数：");
		for(int i=0;i<odd.size();i++) {
			System.out.print(odd.get(i)+" ");
		}
		/*拡張for文を使って以下のようにしても可
		for(int i:odd) {
			System.out.print(i+" ");
		}
		*/
		System.out.println();

	}

}
