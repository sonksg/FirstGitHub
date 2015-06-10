

public class Bank implements Bank_ATM{
	
	private double balance;

	public Bank(){
		balance = 0;
	}
	public Bank(double x){
		balance = x;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public  void deposit(double amount){
		balance = balance + amount;
	}
	
	public void withDraw(double amount){
		balance = balance - amount;
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withDraw() {
		// TODO Auto-generated method stub
		
	}
	
}
