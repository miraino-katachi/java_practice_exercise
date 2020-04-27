package Exercises2;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 3 ; i++){
            for(int j = 0; j < 3; j++){
            	try {
            		System.out.print(i + "/ " + j + " = " + i/j + " ");
            	}catch(ArithmeticException e) {
            		System.out.println("0で割り算はできません。");
            	}
            }
            System.out.println();
        }
    }
}
