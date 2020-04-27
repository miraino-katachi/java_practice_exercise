import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int wins = 0;

		for( int i = 0 ; i < 10 ; i++ ) {
		    int result = Integer.parseInt( br.readLine() );

		    if( result == 1 ) {
		        wins += 1;
		    }
		}

		System.out.println( "勝ち" + wins + "回、負け" + ( 10 - wins ) + "回" );
	}

}
