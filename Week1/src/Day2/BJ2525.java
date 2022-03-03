package Day2;

import java.util.Scanner;

public class BJ2525 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		int h, m;
		m=b+c;
		h=a;
		while (m>=60) {
			m-=60;
			h+=1;
			if(h>=24) {
				h-=24;
			}
		}
		System.out.println(h+" "+m);

	}

}
