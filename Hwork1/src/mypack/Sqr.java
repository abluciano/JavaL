package mypack;

public class Sqr {

	int a;
	int b;
	int c;
	double D;
	
	Sqr(int a, int b, int c){
		
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	
	public void SqrUr(){
		
		float x1;
		float x2;
		
		if (a == 0){
			System.out.println("������ ���������� �� ����� ���� = 0");
			return;
		}
		
		D = Math.pow(b, 2)-4*a*c;
		
		if (D<0){
			System.out.println("������������ ������� ���");
			return;
		}
		
		if (D>0){
			x1 = (float)((-1*b+Math.sqrt(D))/2*a);
			x2 = (float)((-1*b-Math.sqrt(D))/2*a);
			System.out.println("������ 1: "+x1+" ������ 2: "+x2);
			return;
		}
		
		if (D==0){
			x1 = (float)((-1*b+Math.sqrt(D))/2*a);
			System.out.println("����� ��������� � �����: "+x1);
			return;
		}
		
	}
	
}
