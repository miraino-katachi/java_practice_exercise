import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] employ_numbers = {1001,1002,1005,1010,1012,1013,1015,1020,1021,1022};
		String[] employ_names = {"鈴木","井上","山本","田川","田中","松本","木下","上野","岡本","吉永"};

		int employ_number = Integer.parseInt(br.readLine());

		for( int i = 0 ; i < 10 ; i++ ) {
			if( employ_number == employ_numbers[i] ) {
		    	System.out.println("社員番号" + employ_number + "は" + employ_names[i] + "さんです");
		    	break;
		    }
		}
	}

}
