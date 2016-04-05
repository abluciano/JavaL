package mypack;

public class LicSchet {
	String accountNumber;
	int restSum;

	public LicSchet(String number) {
		this.accountNumber = number;
		this.restSum = 0;
	}

	public int getRestSum() {
		return restSum;
	}

	public void setRestSum(int restSum) {
		this.restSum = restSum;
	}

}
