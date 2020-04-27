import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int value = Integer.parseInt( br.readLine() );
		int n;

		for( n = 2 ; n <= ( value / 2 ) ; n++ ){
		    if( ( value % n ) == 0 ) {
		        break;
		    }
		}

		if( n > ( value / 2 ) ) {
		    System.out.println( value + "は素数です" );
		} else {
		    System.out.println( value + "は素数ではありません" );
		}
	}

}
