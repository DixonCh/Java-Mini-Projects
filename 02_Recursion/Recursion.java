
public class Recursion {

	public static void main(String[] args) {
		Recursion a = new Recursion(); 
		
		System.out.println(a.fact(0));
		
		System.out.println(a.fact(6));
		//static fn can call non static fn with an instance, not directly
		}


	int fact(int n) {
	if(n==1||n==0) return 1;
	return n*fact(n-1);

	}
}

