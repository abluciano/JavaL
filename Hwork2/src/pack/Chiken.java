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
		System.out.println("������������");
		}else {System.out.println("Ko-ko-ko");}
		
	}

	@Override
	public void beOlder() {
		for (int i = age; i<=16; i+=older){
			System.out.println("������� ��� "+ older+" ������ ��� "+i);
		}
		
		System.out.println("finita la comedia. RIP");
	}
	
	public void Eat(Human A){
	
		if (war==false){
		System.out.println("������ ������� ������ "+A.name+" ������� ��� ����");
		}else{
			System.out.println("������ ����������� ������ "+A.name+" ������� ��� �������� �������");
		}
	}
	
}
