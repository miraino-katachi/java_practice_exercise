import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.Collections;

public class Exercise10 {
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> array=new ArrayList<Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String str=br.readLine();
			int value=Integer.parseInt(str);
			if(value==0) {
				break;
			}
			array.add(value);
		}

		System.out.println();
		for(int i=array.size()-1;i>=0;i--) {
			System.out.print(array.get(i)+" ");
		}

		//Collections.reverse、拡張for文を使って以下のようにしても可
		/*
		Collections.reverse(array);
		for(int i:array){
			System.out.print(i+" ");
		}
		*/

		System.out.println();
	}
}
