package mypack;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;

public class Run {

	
	public static void main(String[] args) {
	
	Random r = new Random();
	final int phoneSize = 1000000;
	String[] arr = new String[phoneSize];
	Set<Phone> phoneSet = new LinkedHashSet<>(phoneSize);
	long currTime = System.currentTimeMillis();
		for (int i=0; i<phoneSize;i++) {
			arr[i]="7";
			for (int j=0; j< 10; j++) {
			arr[i] += Integer.toString(r.nextInt(9));
			}
		}
	
		System.out.println("����� ���������� �������: "+(System.currentTimeMillis() - currTime)+" ����");
		
		for (int i=0; i<phoneSize;i++) {
			String str="7";
			for (int j=0; j< 10; j++) {
			str += Integer.toString(r.nextInt(9));
			}
			phoneSet.add(new Phone(str));
		}
		currTime = 0;
		currTime = System.currentTimeMillis();
	//	ListIterator<Phone> itPhone = (ListIterator<Phone>) phoneSet.iterator(); ��� ����� ����������...
		
		Iterator<Phone> itPhone = phoneSet.iterator();
		while (itPhone.hasNext()){
			Phone a = itPhone.next();
			//System.out.println(a.pNum+"\n");
		}
		
		System.out.println("����� ������� �� ���� � ������ �����������: "+(System.currentTimeMillis() - currTime)+" ����");
		

	/* ... ��� ��� ��� ������� �� ����	
		while (itPhone.hasPrevious()){
			Phone a = itPhone.next();
		}
		
		System.out.println("����� ������� �� ���� � �������� �����������: "+(System.currentTimeMillis() - currTime)+" ����");
		*/
		
		
		
	}

}
