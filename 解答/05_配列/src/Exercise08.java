public class Exercise08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] matrix=new int[3][3];

		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j]=new java.util.Random().nextInt(10);
			}
		}

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
		System.out.println();

		int max=matrix[0][0];
		int min=matrix[0][0];

		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(max<matrix[i][j]) {
					max=matrix[i][j];
				}
				if(min>matrix[i][j]) {
					min=matrix[i][j];
				}
			}
		}

		System.out.println("最大値:"+max);
		System.out.println("最小値:"+min);
	}

}
