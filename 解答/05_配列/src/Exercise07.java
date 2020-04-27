
public class Exercise07 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		int[][] matrix=new int[3][3];

		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j]=j+i*matrix[i].length+1;
			}
		}
		//以下のように値を初期化しても可
		//int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};


		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		//拡張for文を使って以下のようにしても可
		/*
		for(int[] array:matrix) {
			for(int value:array) {
				System.out.print(value+" ");
			}
			System.out.println();
		}
		*/

	}
}
