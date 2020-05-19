import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Exercise15 {
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> array=new ArrayList<Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String str=br.readLine();
			int n=Integer.parseInt(str);
			if(n==0) {
				break;
			}
			array.add(n);
		}

		Iterator<Integer> it=array.iterator();
		while(it.hasNext()) {
			int n=it.next();
			if(n==2) {
				it.remove();
			}
		}


		System.out.println();
		for(int i=0;i<array.size();i++) {
			System.out.print(array.get(i)+" ");
		}

		//拡張for文を使って以下のようにしても可
		/*
		for(int n:array){
			System.out.print(n+" ");
		}
		*/

		System.out.println();
	}
}
