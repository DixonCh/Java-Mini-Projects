import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConsoleInputEx {

	public static void main(String[] args) throws IOException  {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		String str[] = new String[100];
		System.out.println("Enter lines of text:");
		System.out.println("Enter 'stop' to exit");
		
		for (int i = 0; i < 100; i++) {
			str[i]=br.readLine();
			String upper = str[i].toUpperCase();
			if(upper.equals("STOP")) break; 
			
			// or this can be used to stop 
			// if (str[i].equals("stop") || str[i].equals("Stop") || str[i].equals("STOP")) break; 
			
		}
		
		System.out.println("\n Here is your text");
		
		for (int i = 0; i < 100; i++) {
			if(str[i].equals("stop")) 
				break;
			System.out.println(str[i]);
			
		}
		

	}

}
