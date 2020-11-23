import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

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

		Collections.sort(array);

		for(int j=0;j<=9;j++) {
			boolean exist=false;
			System.out.print("一の位が"+j+":");
			for(int i=0;i<array.size();i++) {
				int value=array.get(i);
				if(value%10==j) {
					System.out.print(value+" ");
					exist=true;
				}
			}
			if(exist) {
				System.out.println();
			}else {
				System.out.println("なし");
			}
		}

		System.out.println();
	}
}
