package pack;

public class Chiken extends Pet{

	boolean war;
	
int ChOlder;
	
	
	
	public Chiken(int age, boolean war, int ChOlder) {
		super(age);
		this.war = war;
		super.setOlder(ChOlder);
	}



	@Override
	public void voice() {
		if (war == false){
		System.out.println("Кукарекууууу");
		}else {System.out.println("Ko-ko-ko");}
		
	}

	@Override
	public void beOlder() {
		for (int i = age; i<=16; i+=older){
			System.out.println("Прожили еще "+ older+" Сейчас нам "+i);
		}
		
		System.out.println("finita la comedia. RIP");
	}
	
	public void Eat(Human A){
	
		if (war==false){
		System.out.println("Хозяин доброго петуха "+A.name+" насыпал ему овса");
		}else{
			System.out.println("Хозяин бойцовского петуха "+A.name+" насыпал ему отборной пшеницы");
		}
	}
	
}
