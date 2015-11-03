import java.util.Scanner;


public class digitalRoots {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Input 9 numbers seperated by a space if the list is under 9 then use 0 to fill up space ");
		int total = 0;
		for(int x = 0; x < 9; x++){
			total+=input.nextInt();
		}
		int w;
		int x;
		int y;
		int z;
		while(total>9){
			while(total>99){
				while(total>999){
					w=((int)total/1000);
					total -= w*1000;
					x= ((int)total/100);
					total -= x*100;
					y = (int)total/10;
					total-=y*10;
					z = total;
					total= w+x+y+z;
				}
				x= ((int)total/100);
				total -= x*100;
				y = (int)total/10;
				total-=y*10;
				z = total;
				total= x+y+z;
			}
			y = (int)total/10;
			total-=y*10;
			z = total;
			total= y+z;
		}
		System.out.print(total);
	}
}
