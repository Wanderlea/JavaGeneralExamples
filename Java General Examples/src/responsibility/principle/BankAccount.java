package responsibility.principle;

public class BankAccount {
	
	private String description;
	private double balance = 8000;
	
	public void sum(){
		balance += 100;
	}
	
	public void decrease(){
		balance -= 200;
	}
	
	public void withdrawMoney(Double value){
		balance -= value;
	}
	
	public void cashDeposit(Double value){
		balance += value;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "BankAccount [description=" + description + ", balance=" + balance + "]";
	}
	
}
