
public class Exercise05 {

	public static void main( String[] args ) {
	    DrawTriangle( 3, '%' );
	    System.out.println();
	    DrawTriangle( 5, '#' );
	    System.out.println();
	    DrawTriangle( 7, '@' );
	}

	static void DrawTriangle( int size, char ch ) {
	    for( int i = 0 ; i < size ; i++ ) {
	        for( int j = 0 ; j <= i ; j++ ) {
	            System.out.print( ch );
	        }
	        System.out.println();
	    }
	}

}
