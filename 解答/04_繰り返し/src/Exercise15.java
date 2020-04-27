import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise15 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;

		for( ; ; ) {
		    int value = Integer.parseInt( br.readLine() );

		    if( value == 0 ) {
		        break;
		    }

		    sum += value;
		}

		System.out.println( "合計は" + sum );
	}

}
