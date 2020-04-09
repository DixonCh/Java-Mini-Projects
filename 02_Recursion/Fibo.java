
public class Fibo {

	
	public static void main(String[] args) {
		int i;
		for (i=1; i<=15; i++) {
			System.out.println(fibo(i));
			//static fn can directly call static fn
		}		
	}
	public static int fibo(int n) {
		if(n==1 ||n==2) return 1;
		else return fibo(n-1)+fibo(n-2);
	}
}