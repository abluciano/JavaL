package pack;

public interface KPP {
	final int DOT = 800; // штраф за превышение
	final int TR = 500; // за прицеп
	final int MASS = 800; // за лишний вес

	public void calculateBill(Car A);

}
