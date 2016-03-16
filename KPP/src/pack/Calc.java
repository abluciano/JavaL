package pack;

import java.io.FileWriter;
import java.io.IOException;

public class Calc implements KPP {

	private String[] CarData = new String[2]; // ������ ��� ���������
	private int price;						  //���� �������

	public void calculateBill(Car A) {

		if (A.type != CarType.NORMAL) { // ��������� ���� ��������

			prn(A);
			return;
		}

		if (A.light == true) {
			price = 1000;
			if (A.speed >= 80) {
				price += DOT; 
			}
			if (A.speed >= 180) {
				System.out.println(A.mark + " � ����������  " + A.gn
						+ " �� �� ������� � �� �� �����, ��� ��� �������� ������� �����");
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
				System.out.println(A.mark + " � ����������  " + A.gn
						+ " �� �� ������� � �� �� �����, ��� ��� �������� ������� �����");
			}

			if (A.weight > 4) {
				System.out.println(A.mark + " � ����������  "+ A.gn +" ���� ������ ������� ������, ������ ��������");

			}

			prn(A);
			return;
		}

	}
// ������ ���������
	private void prn(Car X) {
		if ((X.speed >= 180) || (X.weight > 4)) { // ��� ����� �������, ��� ���������
			return;
		}
		CarData[0] = "������:\t" + X.mark;
		if (X.type != CarType.NORMAL) {
			CarData[1] = "\n��������� ��������� ��������� ��������";
		} else {
			CarData[1] = "\n��������� �������:\t" + Integer.toString(price) + " ������";
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
