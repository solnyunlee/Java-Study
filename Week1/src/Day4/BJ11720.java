package Day4;

import java.util.Scanner;

public class BJ11720 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String a = scanner.next();
		scanner.close();
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += a.charAt(i)-'0';
		}
		System.out.print(sum);
	}

}
