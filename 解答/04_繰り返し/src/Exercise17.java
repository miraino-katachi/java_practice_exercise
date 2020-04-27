import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise17 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt( br.readLine() );

		for( int i = 0 ; i < size ; i++ ) {
		    for( int j = 0 ; j < size ; j++ ) {
		        System.out.print( "$" );
		    }
		    System.out.println();
		}
	}

}
