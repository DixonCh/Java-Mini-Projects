import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOutputEx {

	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		FileWriter fw = new FileWriter("D:\\xyz.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		String str;
		System.out.println("Enter lines of text");
		System.out.println("and enter 'stop' to exit");

		for (int i = 0; i < 100; i++) {
			str = br.readLine();
			if (str.equals("stop"))
				break;
			bw.write(str);
			bw.newLine();
		}
		bw.close();
		fw.close();
		System.out.println("The file is created! Check now.");

	}

}
