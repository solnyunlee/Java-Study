package Day4;

import java.util.Scanner;

public class BJ1157 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int [26];
		String s = scanner.next();
		scanner.close();
		
		for(int i=0;i<s.length();i++) {
			if('A'<=s.charAt(i) && 'Z'>=s.charAt(i)) {
				arr[s.charAt(i)-'A']++;
			}
			else {
				arr[s.charAt(i)-'a']++;
			}
		}
		int max = -1;
		char ch = '?';
		for(int i=0;i<26;i++) {
			if(arr[i]>max) {
				max = arr[i];
				ch = (char)(i+65);
			}
			else if(arr[i] ==max) {
				ch = '?';
			}
		}
		System.out.print(ch);
	}

}
