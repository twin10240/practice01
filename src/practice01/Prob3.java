package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );
		
		while(true){
			System.out.print("숫자를 입력하세요 : ");
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
			System.out.println("결과 값 : " + sum);
		}
	}
}