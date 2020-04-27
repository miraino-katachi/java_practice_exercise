import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt( br.readLine() );

		for( int i = 0 ; i < count ; i++ ) {
		    System.out.print( "*" );
		}

		//while文を使用した解答例
		/*
		int count = Integer.parseInt( br.readLine() );

		while( count > 0 ) {
		    System.out.print( "*" );
		    count--;
		}
		*/
	}

}
