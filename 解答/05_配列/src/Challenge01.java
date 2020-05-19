import java.util.ArrayList;

public class Challenge01 {
	public static void main(String[] args){
		ArrayList<Character> s=new ArrayList<Character>();

		System.out.println("世代	長さ	文字列");
		s.add('A');
		System.out.print(0+"	"+s.size()+"	");
		for(char c:s) {
			System.out.print(c);
		}
		System.out.println();

		for(int i=0;i<8;i++) {
			ArrayList<Character> t=new ArrayList<Character>();
			for(char c:s) {
				if(c=='A') {
					t.add('A');
					t.add('B');
				}else {
					t.add('A');
				}
			}
			s=t;
			System.out.print((i+1)+"	"+s.size()+"	");
			for(char c:s) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
