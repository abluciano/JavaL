package pack;

public class Cat extends Pet{
	
	String poroda;
	private final String voice = "Meou";
	
int CatOlder;
	
	
	
	public Cat(int age, String poroda, int CatOlder) {
		super(age);
		this.poroda = poroda;
		super.setOlder(CatOlder);
	}



	@Override
	public void voice() {
		System.out.println(voice);
		
	}

	@Override
	public void beOlder() {
		for (int i = age; i<=16; i+=older){
			System.out.println("Прожили еще "+ older+" Сейчас нам "+i);
		}
		
		System.out.println("finita la comedia. RIP");
	}
	
	public void Eat(Human A){
		System.out.println("Хозяин  "+poroda+" кошки "+A.name+" дал ей вискасу");
	}
	
	}


	


