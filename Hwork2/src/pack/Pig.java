package pack;

public class Pig extends Pet{

	float weight;
	boolean slip = false;
	int PigOlder;
	
	
	
	public Pig(int age, float weight, boolean slip, int PigOlder) {
		super(age);
		this.weight = weight;
		this.slip = slip;
		super.setOlder(PigOlder);
	}



	@Override
	public void voice() {
		if (slip == true){
		System.out.println("Zzzzzzzzzzz.....");
		}else {System.out.println("���");}
		
	}

	@Override
	public void beOlder() {
		for (int i = age; i<=6; i+=older){
			System.out.println("������� ��� "+ older+" ������ ��� "+i);
		}
		
		System.out.println("finita la comedia. ������");
	}
	
	public void Eat(Human A){
		
		if (slip==false){
		System.out.println("������ ����� "+A.name+" ������� �� ������");
		}else{
			System.out.println("������ ��� ��������� � ����");
		}
	}
}
