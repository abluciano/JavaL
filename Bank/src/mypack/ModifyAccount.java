package mypack;

public class ModifyAccount extends Thread {

	private LicSchet money;
	private int pay;

	public ModifyAccount(LicSchet money) {

		this.money = money;
	}

	public ModifyAccount(LicSchet money, int pay) {

		this.money = money;
		this.pay = pay;
	}

	@Override
	public void run() {

		if (pay == 0) {
			for (int i = 0; i < 6; i++) {
				money.setRestSum(money.restSum + 30000);
			}
		} else {
			for (int i = 0; i < 6; i++) {
				money.setRestSum(money.restSum - pay);
			}

		}

	}
}