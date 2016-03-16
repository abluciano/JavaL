package pack;

public class Run {

	public static void main(String[] args) {

		Car list[] = new Car[4];

		list[0] = new Car("mersedes", "x777xx", 90, CarType.NORMAL);
		list[1] = new Car("LADA", "a723cc", 90, CarType.GIBDD);
		list[2] = new Car("MAN", "P737kc", 12, CarType.NORMAL, 2, 17, false);
		list[3] = new Car("SCANIA", "o192TT", 200, CarType.NORMAL, 5, 5, true);
		Calc kvit = new Calc();
		for (int j = 0; j < list.length; j++) {
			kvit.calculateBill(list[j]);
		}

	}

}
