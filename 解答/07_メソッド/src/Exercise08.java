
public class Exercise08 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			if (i == 0 || i == 2) {
				for(int j = 0; j < args[0].length() + 4; j++) {
					System.out.print("+");
				}
			} else {
				System.out.print("+ ");
				System.out.print(args[0]);
				System.out.print(" +");
			}
			System.out.println();
		}

	}

}
