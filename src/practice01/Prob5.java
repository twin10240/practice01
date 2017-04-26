package practice01;

public class Prob5 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i < 10 && (i % 3 == 0 || i % 6 == 0 || i % 9 == 0)) {
				System.out.println(i + " ¦");
			} else {
				if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
					if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
						System.out.println(i + " ¦¦");
					} else {
						System.out.println(i + " ¦");
					}
				} else {
					if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
						System.out.println(i + " ¦");
					}
				}
			}
		}
	}
}