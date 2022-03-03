package Day3;

import java.util.Scanner;

public class BJ8393 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, i, sum=0;
		n = scanner.nextInt();
		scanner.close();
		for (i=1;i<=n;i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
