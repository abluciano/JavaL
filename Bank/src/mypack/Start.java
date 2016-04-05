package mypack;

public class Start {

	public static void main(String[] args) {

		LicSchet sberbank = new LicSchet("405959893837372");

		ModifyAccount salary = new ModifyAccount(sberbank);
		ModifyAccount autopay = new ModifyAccount(sberbank, 1000);
//		ModifyAccount autopay2 = new ModifyAccount(sberbank, 1000);
//		ModifyAccount autopay3 = new ModifyAccount(sberbank, 1000);
//		ModifyAccount autopay4 = new ModifyAccount(sberbank, 1000);

		salary.start();
		autopay.start();
//		autopay2.start();
//		autopay3.start();
//		autopay4.start();

		while (true) {
			if (!salary.isAlive() && !autopay.isAlive() /*&& !autopay2.isAlive()&& !autopay3.isAlive()&& !autopay4.isAlive()*/) {
				System.out.println("Остаток на Вашем счету: " + sberbank.getRestSum() + " руб.");
				break;
			}
		}

	}

}
