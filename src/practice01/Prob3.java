package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );
		
		while(true){
			System.out.print("���ڸ� �Է��ϼ��� : ");
			int num = scanner.nextInt();
			int sum = 0;
			
			for (int i = 0; i <= num; i++) {
				if (num % 2 == 0) {
					if (i % 2 == 0) {
						sum += i;
					}
				}else{
					if (i % 2 == 1) {
						sum += i;
					}
				}
			}
			System.out.println("��� �� : " + sum);
		}
	}
}