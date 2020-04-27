
public class Exercise09 {

	public static void main(String[] args) {
		System.out.print(factorial(5));
	}

    static int factorial(int n){
        if (n == 0) {
            return  1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
