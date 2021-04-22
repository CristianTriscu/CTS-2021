package Builder;

public class BankAccount {
	private String owner;
	private int accountId;
	private float balance;

	@Override
	public String toString() {
		return "BankAccount [owner=" + owner + ", accountId=" + accountId + ", balance=" + balance + "]";
	}

	private BankAccount() {

	}

	public static class Builder {
		private String owner;
		private int accountId;
		private float balance;

		public Builder(String owner) {
			this.owner = owner;
		}

		public Builder addAccountId(int accountId) {
			this.accountId = accountId;
			return this;
		}

		public Builder addBalance(float balance) {
			this.balance = balance;
			return this;
		}

		public BankAccount build() {
			BankAccount bankAccount = new BankAccount();
			bankAccount.accountId = this.accountId;
			bankAccount.balance = this.balance;
			bankAccount.owner = this.owner;

			return bankAccount;

		}

	}

}
