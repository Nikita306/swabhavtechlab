package com.techlab.accountexception;

public class InSuffectiontFundException extends RuntimeException {
	private double ammount;
	Account acc;

	public InSuffectiontFundException(Account acc, double ammount) {
		this.acc = acc;
		this.ammount=ammount;
	}

	@Override
	public String getMessage() {

		return String.format("Account no "+ acc.getAccountNo()+ " Account holder is "
						+ acc.getName()+" trying to withdrawl ammount " +this.ammount+" is less than 500 soo you Cannot Withdrawl ammount");
	}

}
