package Week_1;
public class BankAccCount {
	private String owner;
	private long balance;
	public BankAccCount(String o, long b) {
		owner = o;
		balance = b;
		}
	public void  setOwner(String owner) {
		this.owner=owner;
	}
	public void  setBalance(long balan) {
		this.balance=balan;
	}
	public void getOwner() {
		System.out.println("Ten nguoi su dung: "+this.owner);
	}
	public void getBalance() {
		System.out.println("So tien co trong tai khoan: "+this.balance);
	}
	public static void main(String[] args) {
		BankAccCount acc1;
		acc1 = new BankAccCount("Hoang", 100000000);
		System.out.println(acc1.owner);
		BankAccCount acc2 = new BankAccCount("Minh", 1000000000);
		acc1.getOwner();
		acc1.getBalance();
		acc2.getOwner();
		acc2.getBalance();
	}
}

