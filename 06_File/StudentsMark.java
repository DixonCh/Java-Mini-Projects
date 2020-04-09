import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

// WAP to maintain db of students. Create a class called StudentMarks which stores name of student, 
// student id, marks of 3 subjects into the file called Student.txt. The file should be stored to
// the following form:
// 		StudentID : StudentName: Sub1Mark : Sub2Mark : Sub3Mark
// Read 30 students info. from the user and store in that file.

public class StudentsMark {

	public static void main(String args[]) throws IOException {

		try {
			InputStreamReader Stin = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(Stin);

			//FileWriter fw = new FileWriter("D:\\xyz.txt");
			FileWriter fw = new FileWriter("xyz.txt");
			PrintWriter pw = new PrintWriter(fw);

			int stdid, mark1, mark2, mark3;
			String stdname;

			for (int i = 0; i <= 2; i++) {

				System.out.println("Enter " + i + " student's info:");
				System.out.println("Id: ");
				stdid = Integer.parseInt(in.readLine());
				System.out.println("Name: ");
				stdname = in.readLine();
				System.out.println("Sub1 Marks : ");
				mark1 = Integer.parseInt(in.readLine());
				System.out.println("Sub2 Marks : ");
				mark2 = Integer.parseInt(in.readLine());
				System.out.println("Sub3 Marks : ");
				mark3 = Integer.parseInt(in.readLine());
				// store data to a file:
				pw.println(stdid + " : " + stdname + " : " + mark1 + " : " + mark2
						+ " : " + mark3);				
			} 
			pw.close();
		} catch (IOException ex) {
			System.out.println(ex.toString());
		}

	}
}
