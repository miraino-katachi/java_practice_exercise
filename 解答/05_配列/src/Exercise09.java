
public class Exercise09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] A=new int[3][3];
		int[][] B=new int[3][3];
		int[][] C=new int[3][3];

		for(int j=0;j<3;j++) {
			for(int i=0;i<3;i++) {
				A[i][j]=(i+j*3)+1;
				B[i][j]=(j+i*3)+1;
			}
		}

		System.out.println("A =");

		for(int j=0;j<3;j++) {
			for(int i=0;i<3;i++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("B =");

		for(int j=0;j<3;j++) {
			for(int i=0;i<3;i++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Dot(A,B)=");
		for(int j=0;j<3;j++) {
			for(int i=0;i<3;i++) {
				for(int h=0;h<3;h++) {
					C[i][j]+=A[h][j]*B[i][h];
				}
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
	}
}
