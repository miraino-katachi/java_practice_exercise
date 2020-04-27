import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max_value = 0, min_value = 0;

		for( int i = 0 ; i < 10 ; i++ )
		{
		    int value = Integer.parseInt( br.readLine() );

		    if( i == 0 ) {
		        max_value = value;
		        min_value = value;
		    } else {
		        if( value > max_value ) {
		            max_value = value;
		        }

		        if( value < min_value ) {
		            min_value = value;
		        }
		    }
		}

		System.out.println( "最大値=" + max_value + " 最小値=" + min_value );
	}

}
