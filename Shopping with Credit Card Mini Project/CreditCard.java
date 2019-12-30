import java.util.*;

public class CreditCard{
	public String name;
	public String address;
	public double contact;
	public double price;
	private int pin;
	private int CCVI;

	public void pay(int pin,int CCVI){
		this.pin=pin;
		this.CCVI=CCVI;
		System.out.println("\nCustomer:How much is the price of phone?");
	}

	public void buy(int pin,int CCVI,double price){
		this.pin=pin;
		this.CCVI=CCVI;
		this.price=price;
		System.out.println("Merchant:The price of phone is:"+price);
		System.out.println("Merchant:You can use CreditCard.");
	}

	public void getPersonDetail(String name,String address,double contact,double price){
		this.name=name;
		this.address=address;
		this.contact=contact;
		System.out.println("Merchant:Sir your bill is:");
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Contact:"+contact);
		System.out.println("Price:"+price);
	}

	public void buy(){
		System.out.println("Merchant:Verifying your CreditCard,please wait.");
	}

	public void pay(){
		System.out.println("Customer:Thankyou for phone.");
	}


}