import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.Collections;

public class Exercise11 {
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
        
        //位ごとに配列を管理する配列（２次元配列）
        ArrayList<ArrayList> kuraiArray = new ArrayList<ArrayList>();

        //入力用配列
		ArrayList<Integer> array=new ArrayList<Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        //格納用配列の作成
        for(int i = 0 ; i < 10 ; i++){
            kuraiArray.add(new ArrayList<Integer>());
        }
        
        //入力
		while(true){
			String str=br.readLine();
			int value=Integer.parseInt(str);
			if(value==0) {
				break;
			}
			array.add(value);
		}
        
        
        
        
	}
}
