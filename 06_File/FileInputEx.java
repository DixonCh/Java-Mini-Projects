import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileInputEx {

	public static void main(String[] args) throws IOException {
		File file = new File("xyz.txt");
		if (file.exists()) {
			FileReader fr = new FileReader("D:\\xyz.txt");
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();

			System.out.println("The contents of the file are:\n");

			int i = 1;

			while (str != null) {
				// System.out.print("The " + i + "th line is:"); 

				System.out.println(str);
				str = br.readLine();

				i++;

			}
			br.close();
		} else {
			System.out.println("The file is not found!");
		}

	}

}
