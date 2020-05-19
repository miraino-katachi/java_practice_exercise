import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Exercise13 {
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> array=new ArrayList<String>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String str=br.readLine();
			if(str.equals("")) {
				break;
			}
			array.add(str);
		}

		System.out.println();
		for(int i=0;i<array.size();i++) {
			System.out.print(array.get(i)+" ");
		}

		//拡張for文を使って以下のようにしても可
		/*
		for(String s:array){
			System.out.print(s+" ");
		}
		*/

		System.out.println();
	}
}
