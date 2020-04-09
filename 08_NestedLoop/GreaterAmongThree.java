import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreaterAmongThree {
	static int fnum, snum, tnum;

	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		String str = new String();
		System.out.println("Enter first number");
		str = br.readLine();
		fnum = Integer.parseInt(str);
		System.out.println("Enter second number");
		str = br.readLine();
		snum = Integer.parseInt(str);
		System.out.println("Enter third number");
		str = br.readLine();
		tnum = Integer.parseInt(str);

		if (fnum > snum) {
			if (fnum > tnum) {
				System.out.println(fnum+ " is greatest");
			} else
				System.out.println(tnum+ " is greatest");

		} else if (snum > tnum) {
			System.out.println(snum+ " is greatest");
		} else {
			System.out.println(tnum+ " is greatest");
		}

	}

}
