public class Shop{
	public static void main(String[] args){
		CreditCard c1=new CreditCard();
		c1.pay(1234,12);
		c1.buy(1234,12,15000);
		c1.buy();
		c1.pay();
		System.out.println("\n");
		c1.getPersonDetail("Dixon","Ktm",9899999999,15000);
	}
}