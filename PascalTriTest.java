import java.util.Scanner;
public class PascalTriTest {
	private static Scanner input;
	public static void main(String[]args){
		input = new Scanner(System.in);
		
		System.out.print("Input the power ");
		int power = input.nextInt();
		int[][]row = new int[power][power];
		row[0][0]= 1;
		System.out.println(row[0][0]);
		int sum = 1;
		int y = 0;
		for (int x = 1; x < power; x++){
			row[x][0] = 1;
			
			System.out.print(row[x][0] + " ");
			for ( y = 1; y <= x; y++){
				row[x][y] = row[x-1][y-1] +row[x-1][y];
				System.out.print(row[x][y] + " ");
				
			}
			sum = sum *2;
			
			System.out.println("   Has a horixontal sum of: " + sum);
			
		}
		
	}
}
