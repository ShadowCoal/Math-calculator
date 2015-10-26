public class matricesbasic {
public static void main(String[]args){
	int[][] list1 = {{3,2,1}, {2,4,5}, {6,2,9}};
	int[][] list2 = {{6, 3, 7},{2,9,1},{3,6,3}};
	int[][] list3 = new int [3][3];
	for(int x = 0; x < 3; x++){
		for (int y = 0; y <3; y ++){
			list3[x][y] = list1[x][y] + list2[x][y];
			System.out.print(list3[x][y] + ", ");
		}
		System.out.println();
	}
	System.out.println();
	for(int x = 0; x < 3; x++){
		for (int y = 0; y <3; y ++){
			list3[x][y] = list1[x][y] - list2[x][y];
			System.out.print(list3[x][y] + ", ");
		}
		System.out.println();
	}
}
}
