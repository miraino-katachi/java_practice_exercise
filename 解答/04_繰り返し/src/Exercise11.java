import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int strike = 0;
		int ball = 0;

		while( strike < 3 && ball < 4 ) {
		    System.out.print( "ストライク=1 or ボール=2 ？" );

		    int judge = Integer.parseInt( br.readLine() );

		    if( judge == 1 ) {
		        strike++;
		    } else if( judge == 2 ) {
		        ball++;
		    }
		}

		System.out.println( ball + "ボール," + strike + "ストライク" );
	}

}
