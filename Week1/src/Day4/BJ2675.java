package Day4;

import java.util.Scanner;

public class BJ2675 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i=0;i<t;i++) {
			int r = scanner.nextInt();
			String s = scanner.next();
			scanner.close();
			for(int j=0; j<s.length();j++) {
				for(int k=0;k<r;k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}

	}

}
