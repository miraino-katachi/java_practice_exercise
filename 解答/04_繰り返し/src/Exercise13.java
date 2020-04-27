import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt( br.readLine() );

		for( int x = 2 ; n > 1 ; x++ ){
		    while( ( n % x ) == 0 ){
		        System.out.print( x + " " );
		        n /= x;
		    }
		}

	}

}
