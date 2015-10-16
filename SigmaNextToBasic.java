import java.util.Scanner;


public class SigmaNext {
	private static Scanner input;
	public static void main(String[]args){
		input = new Scanner(System.in);
		System.out.print("Enter 1- for adding and subtracting, 2- for divstion 3- for multiplication 4- for power");
		int answer = input.nextInt();
		if (answer == 1)
			adding();
		
		if (answer == 2)
			divsion();
		if (answer == 3)
			multiplication();
		if (answer == 4)
			square();
		
	}
	public static void adding(){
		input = new Scanner(System.in);
		System.out.print("input start: ");
		int k = input.nextInt();
		System.out.print("input stop: ");
		int stop = input.nextInt();
		System.out.print("input add or subtract: ");
		double add = input.nextInt();
		int n = k;
		double total = 0;
		double out = 0;
		for(int x = 0; x < (stop -k); x++)
		{
			out = n + add;
			total += out;
			System.out.print(out);
			if (x != (stop - k - 1))
				System.out.print(" + ");
			else
				System.out.println(" = " + total);
			n = n+1;
			
		}
	}
	public static void divsion(){
		input = new Scanner(System.in);
		System.out.print("input start: ");
		int k = input.nextInt();
		System.out.print("input stop: ");
		int stop = input.nextInt();
		System.out.print("input divide by: ");
		double div = input.nextInt();
		int n = k;
		double out = 0;
		double total =0;
		for(int x = 0; x <(stop - k); x ++){
			out = n/div;
			total += out;
			System.out.print(out);
			if (x != (stop - k - 1))
				System.out.print(" + ");
			else
				System.out.println(" = " + total);
			n = n+ 1;
		}
	}
	public static void multiplication(){
		input = new Scanner(System.in);
		System.out.print("input start: ");
		int k = input.nextInt();
		System.out.print("input stop: ");
		int stop = input.nextInt();
		System.out.print("input times by: ");
		double time = input.nextInt();
		int n = k;
		double out = 0;
		double total =0;
		for(int x = 0; x <(stop - k); x ++){
			out = n*time;
			total += out;
			System.out.print(out);
			if (x != (stop - k - 1))
				System.out.print(" + ");
			else
				System.out.println(" = " + total);
			n = n+ 1;
		}
	}
	public static void square(){
		input = new Scanner(System.in);
		System.out.print("input start: ");
		int k = input.nextInt();
		System.out.print("input stop: ");
		int stop = input.nextInt();
		System.out.print("input power: ");
		int pow = input.nextInt();
		int n = k;
		int[]group = new int[stop - k];
		int total =0;
		for(int x = 0; x < (stop - k); x++){
			group[x] = power(n, pow);
			total += group[x];
			System.out.print(group[x]);
			if (x != (stop - k -1)){
				System.out.print(" + ");
			}
			else
				System.out.println(" = " + total);
			n = n +1;
	}}
	public static int power(int n,int pow){
		
		if (pow == 0)
			return 1;
		
		else return n* power(n, pow -1);
	}
}
