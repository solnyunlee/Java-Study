package Day4;

import java.io.*;
import java.util.StringTokenizer;

public class BJ10952 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		while (a!=0 && b!=0 && a<10 && b<10) {
			bw.write(a+b + "\n");
			st = new StringTokenizer(br.readLine()," ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
		}
		
		br.close();

		bw.flush();
		bw.close();


	}

}
