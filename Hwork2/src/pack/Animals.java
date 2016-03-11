package pack;

public class Animals {

	public static void main(String[] args) {
	
		Human sidorov = new Human("Сидоров И.И.", 45);
		
		Pet zoosad[] = new Pet[4];
		zoosad[0] = new Dog(5, "ohota", 1);
		zoosad[1] = new Cat(2,"pers", 2);
		zoosad[2] = new Chiken(4, true, 1);
		zoosad[3] = new Pig(3, 14.3f, false, 1);
		
		for (int i = 0; i<zoosad.length; i++){
			zoosad[i].Eat(sidorov);
			zoosad[i].voice();
		  
		}
	}

}
