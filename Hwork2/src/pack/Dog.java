package pack;

public final class Dog extends Pet{

	private final String voice = "���-���";
    public final String type; //���������, ���������, ����������...
	int DogOlder;
	
	
	
	public Dog(int age, String type, int DogOlder) {
		super(age);
		this.type = type;
		super.setOlder(DogOlder);
	}



	@Override
	public final void voice() {
		System.out.println(voice);
		
	}

	@Override
	public final void beOlder() {

		for (int i = age; i<=16; i+=older){
			System.out.println("������� ��� "+ older+" ������ ��� "+i);
		}
		
		System.out.println("finita la comedia. RIP");
	}


	public void Eat(Human A){
		System.out.println("������ ������ "+A.name+" ��� �� ��������");
	}
	
}
