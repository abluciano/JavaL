package pack;

import java.io.FileWriter;
import java.io.IOException;

public class Calc implements KPP {

	private String[] CarData = new String[2]; // данные для квитанции
	private int price;						  //цена проезда

	public void calculateBill(Car A) {

		if (A.type != CarType.NORMAL) { // госмашины едут свободно

			prn(A);
			return;
		}

		if (A.light == true) {
			price = 1000;
			if (A.speed >= 80) {
				price += DOT; 
			}
			if (A.speed >= 180) {
				System.out.println(A.mark + " с госномером  " + A.gn
						+ " Вы не Шумахер и не на треке, так что ожидайте патруль ГИБДД");
				return;
			}

			prn(A);
			return;
		} else {
			price = 2000;
			if (A.trailer == true) {
				price += TR;
			}
			if (A.height >= 10) {
				price += MASS;
			}
			if (A.speed >= 80) {
				price += DOT;
			}
			if (A.speed >= 180) {
				System.out.println(A.mark + " с госномером  " + A.gn
						+ " Вы не Шумахер и не на треке, так что ожидайте патруль ГИБДД");
			}

			if (A.weight > 4) {
				System.out.println(A.mark + " с госномером  "+ A.gn +" Ваша машина слишком высока, проезд запрещен");

			}

			prn(A);
			return;
		}

	}
// Печать квитанции
	private void prn(Car X) {
		if ((X.speed >= 180) || (X.weight > 4)) { // вот менты приедут, все посчитают
			return;
		}
		CarData[0] = "Машина:\t" + X.mark;
		if (X.type != CarType.NORMAL) {
			CarData[1] = "\nГосударев транспорт проезжает свободно";
		} else {
			CarData[1] = "\nСтоимость проезда:\t" + Integer.toString(price) + " рублей";
		}

		String fname = X.mark + X.gn;
		try {
			FileWriter fw = new FileWriter("C:\\KPP\\" + fname + ".txt", false);
			for (int i = 0; i < 2; i++) {
				fw.write(CarData[i]);
			}
			fw.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}

}
