package hello;
import java.util.Scanner;
public class Nest_Loop {
	public static void main(String[] args) {
		/*for(int i=1;i<=4;i++) {
			for(int j=1;j<i+1;j++) {
				 System.out.print(""+j);
				}
			 System.out.println();*/
	/*	int num = 6;//rows
		for (int i = 0; i<=num; i++) {
			//for(int j =1;j>=i; j--)
			for(int j = 1; j<=num-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		}
	}
*/
		
		//Diamond patter
		Scanner sc = new Scanner(System.in);
		
		//No. of rows by user to give for pattern printing
		System.out.println("Enter the no of rows:");
		int rows = sc.nextInt();
		
		//Top half of diamond
		for(int i = 1; i<=rows;i++) {
			//leading spaces
			for(int j = 1; j<rows; j++) {
				System.out.print(" ");
			}
			//print *
			for(int k = 1; k<=(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*//Bottom half of diamond
				for(int i = rows-1; i>=1;i++) {
					//leading spaces
					for(int j = rows; j>i; j--) {
						System.out.print(" ");
					}
					//print *
					for(int k = 1; k<=(2*i-1);k++) {
						System.out.print("*");
					}
					System.out.println();
				}*/
}
}
