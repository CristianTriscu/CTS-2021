package Builder;

public class Main {

	public static void main(String[] args) {
			BankAccount bankAcc= new BankAccount.Builder("Cristian")
					.addAccountId(13)
					.addBalance(2000)
					.build();
			System.out.println(bankAcc);
	}

}



