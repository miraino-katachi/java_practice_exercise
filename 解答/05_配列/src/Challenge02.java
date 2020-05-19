
public class Challenge02 {
	public static void main(String[] args) {
		//int n=33;//32+1
		int n=65;//64+1
		int[][] matrix=new int[n/2][n];

		matrix[0][n/2]=1;

		//1次元セルオートマトン（ルール18）による実装
		//http://mathworld.wolfram.com/ElementaryCellularAutomaton.html
		for(int row=1;row<n/2;row++) {
			for(int col=1;col<n-1;col++) {
				if(matrix[row-1][col-1]==0 && matrix[row-1][col]==0 &&matrix[row-1][col+1]==0) {
					//□□□→□
					matrix[row][col]=0;
				}else if(matrix[row-1][col-1]==0 && matrix[row-1][col]==0 &&matrix[row-1][col+1]==1) {
					//□□■→■
					matrix[row][col]=1;
				}else if(matrix[row-1][col-1]==0 && matrix[row-1][col]==1 &&matrix[row-1][col+1]==0) {
					//□■□→□
					matrix[row][col]=0;
				}else if(matrix[row-1][col-1]==0 && matrix[row-1][col]==1 &&matrix[row-1][col+1]==1) {
					//□■■→□
					matrix[row][col]=0;
				}else if(matrix[row-1][col-1]==1 && matrix[row-1][col]==0 &&matrix[row-1][col+1]==0) {
					//■□□→■
					matrix[row][col]=1;
				}else if(matrix[row-1][col-1]==1 && matrix[row-1][col]==0 &&matrix[row-1][col+1]==1) {
					//■□■→□
					matrix[row][col]=0;
				}else if(matrix[row-1][col-1]==1 && matrix[row-1][col]==1 &&matrix[row-1][col+1]==0) {
					//■■□→□
					matrix[row][col]=0;
				}else if(matrix[row-1][col-1]==1 && matrix[row-1][col]==1 &&matrix[row-1][col+1]==1) {
					//■■■→□
					matrix[row][col]=0;
				}
			}
		}

		//以下のように実装しても可
		//パスカルの三角形を利用した実装
		/*
		for(int row=1;row<n/2;row++) {
			for(int col=1;col<n-1;col++) {
				matrix[row][col]=(matrix[row-1][col-1]+matrix[row-1][col+1])%2;
			}
		}
		*/

		for(int row=0;row<n/2;row++) {
			for(int col=0;col<n;col++) {
				if(matrix[row][col]==1) {
					System.out.print('*');
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}

	}
}
