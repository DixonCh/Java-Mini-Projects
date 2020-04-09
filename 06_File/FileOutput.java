import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOutput {

	public static void main(String args[]) throws IOException {

		try {
			FileWriter fw = new FileWriter("D:\\xyz.txt", false);
			PrintWriter pw = new PrintWriter(fw, true);
			pw.println("Some text data that will be flush is called");
			pw.flush();
			pw.println("This is not read to call flush");
			pw.close();
			System.out.print("Done! see file");
		} catch (IOException ex) {
			System.out.println(ex.toString());
		}

	}

}
