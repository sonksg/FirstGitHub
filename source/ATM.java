

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result;
		Bank B = new Bank();
		
		result = B.getBalance();
		System.out.println(result);
		
		B = new Bank(50.00);
		
		result = B.getBalance();
		System.out.println(result);
		
		B.deposit(400.00);
		
		//result = B.getBalance();
		System.out.println(B.getBalance());
	}

}
