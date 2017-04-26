package practice01;

public class Prob2 {
	public static void main(String[] args) {
		int[][] arrNum = new int[9][10];
		
		for (int i = 0; i < arrNum.length; i++) {
			for (int j = 0; j < arrNum[i].length; j++) {
				arrNum[i][j] = (i + 1) + j;
				System.out.print(arrNum[i][j] + "\t");
			}
			System.out.println();
		}
	}
}