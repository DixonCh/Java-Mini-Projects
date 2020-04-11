/*	Create a class called students having members' roll no, name, class and section. 
	Create a method. Input data to read information of students as parameters. 
	Also create another method, display the info of students.
*/

public class ClassEx {
	public static void main(String[] args)  {
		Student s = new Student();
		s.InputRecord(1, "John", "IT", "A");
		s.displayRecord();
	}

}
class Student {
	int rollno;
	String name, Class, sec;
	
	//method to take the input
	void InputRecord (int r, String n, String c, String s) {
		rollno = r;
		name = n;
		Class = c;
		sec = s;
	}
	
	//method to display the roll number, name and section
	void displayRecord() {
		System.out.println("Roll no: "+rollno);
		System.out.println("Name is: "+name);
		System.out.println("Section: "+sec);
	}
}
