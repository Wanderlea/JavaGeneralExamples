package responsibility.principle;

public class TesteAccount {

	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDescription("Current Account");
		
		bankAccount.cashDeposit((double) 1000);
		
		System.out.println(bankAccount);

	}

}
