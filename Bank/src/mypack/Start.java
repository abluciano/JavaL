package mypack;

public class Start {

	public static void main(String[] args) {

		LicSchet sberbank = new LicSchet("405959893837372");

		ModifyAccount salary = new ModifyAccount(sberbank);
		ModifyAccount autopay = new ModifyAccount(sberbank, 1000);

		salary.start();
		autopay.start();

		while (true) {
			if (!salary.isAlive() && !autopay.isAlive()) {
				System.out.println("������� �� ����� �����: " + sberbank.getRestSum() + " ���.");
				break;
			}
		}

	}

}
