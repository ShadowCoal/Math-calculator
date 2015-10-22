import java.util.Scanner;

public class SigmaMid {
	private static Scanner input;
public static void main(String[]args){
	input = new Scanner(System.in);
	
	System.out.print("Start: ");
	int start = input.nextInt();
	System.out.print("End: ");
	int end = input.nextInt();
	System.out.println("slope(m*x +b)^pow + h");
	System.out.print("enter m: ");
	int m = input.nextInt();
	System.out.print("Enter b: ");
	int b = input.nextInt();
	System.out.print("Enter pow: ");
	int pow = input.nextInt();
	System.out.print("Enter slope: ");
	int slope = input.nextInt();
	System.out.print("Enter h: ");
	int h = input.nextInt();
	
	int answer = 0;
	int total = 0;
	while (start <= end){
		int x = start;
		answer = (m*x + b);
		
		answer = power(answer, pow);
		answer = answer*slope + h;
		System.out.print(answer + " ");
		total += answer;
		start += 1;
	}
	System.out.println("Total: " + total);
}
public static int power(int n,int pow){
	
	if (pow == 0)
		return 1;
	
	else return n* power(n, pow -1);
}
}
