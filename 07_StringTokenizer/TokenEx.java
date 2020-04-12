//Program to tokenize the string

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class TokenEx {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\xyz.txt");
		FileReader f = new FileReader(file);
		if (file.exists()) {
			BufferedReader br = new BufferedReader(f);
			String line = br.readLine();

			while (line != null) {
				StringTokenizer st = new StringTokenizer(line, " : ");
				System.out.println("ID: " + st.nextToken());
				System.out.println("Name: " + st.nextToken());
				int ScoresCount = st.countTokens();
				
				int sum = 0;
				for (int i = 0; i < ScoresCount; i++) {
					int score = Integer.parseInt(st.nextToken());
					System.out.println(score + "\t");
					sum += score;
				}
				System.out.println("Total marks= " + sum);
				line = br.readLine();
			}
			br.close();
		}

	}

}
