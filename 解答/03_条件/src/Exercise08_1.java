import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise08_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int score = Integer.parseInt( br.readLine() );

		if( score < 0 || 100 < score ){
			System.out.println( "エラーです" );
			System.exit(0);
		}

		if( score >= 60 ) {
			System.out.println( "合格" );
		} else {
			System.out.println( "不合格" );
		}
	}

}
