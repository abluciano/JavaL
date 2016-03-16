package pack;

public class Car {
	String mark;
	String gn;
	int speed;
	CarType type;
	boolean light;
	int weight;
	int height;
	boolean trailer;

	public Car(String mark, String gn, int speed, CarType s) { // легковушка
		this.mark = mark;
		this.gn = gn;
		this.speed = speed;
		this.type = s;
		this.light = true;

	}

	public Car(String mark, String gn, int speed, CarType type, int weight, int height, boolean trailer) { // грузовик
		this.mark = mark;
		this.gn = gn;
		this.speed = speed;
		this.type = type;
		this.weight = weight;
		this.height = height;
		this.trailer = trailer;
		this.light = false;
	}

}
