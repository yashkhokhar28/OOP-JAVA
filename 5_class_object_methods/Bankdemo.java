class Bank_Account {
	long actno;
	String username;
	String email;
	String acttype;
	double actbalance;

	public Bank_Account(long actno, String username, String email, String acttype, double actbalance) {
		this.actno = actno;
		this.username = username;
		this.email = email;
		this.acttype = acttype;
		this.actbalance = actbalance;
	}

	public String getAcoountDetaile() {
		return acttype + " - " + actno + " - " + actbalance;
	}

	public void displayAccountDetails() {
		System.out.println(acttype + " - " + actno + " - " + actbalance);
	}
}

public class Bankdemo {
	public static void main(String[] args) {
		Bank_Account b1 = new Bank_Account(123, "yash", "yashkhokhar28@gmail.com", "savings", 20000);
		b1.displayAccountDetails();

		String ans = b1.getAcoountDetaile();

		System.out.println(ans);
	}
}