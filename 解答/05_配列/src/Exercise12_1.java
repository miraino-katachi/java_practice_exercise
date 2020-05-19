import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise12_1 {
	public static void main(String[] args){
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();

		for(int i=0;i<10;i++) {
			list.add(new ArrayList<Integer>());
		}

		Scanner sc=new Scanner(System.in);
		while(true) {
			int num=sc.nextInt();
			if(num==0) {
				break;
			}
			list.get(num%10).add(num);
		}
		sc.close();

		int n=0;
		for(ArrayList<Integer> array:list) {
			System.out.print("1の位が"+ n++ +":");
			if(array.size()==0) {
				System.out.println("なし");
				continue;
			}
			Collections.sort(array);
			for(int value:array) {
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
}
