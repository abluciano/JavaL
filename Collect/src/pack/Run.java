package pack;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Run {

	public static void main(String[] args) {
		
		ArrayList div = new ArrayList();
	//	HashSet div = new HashSet();
		
		div.add(new Employee("������ �.�.", 12));
		div.add(new Employee("����� �.�,", 1));
		div.add(new Employee("������� �.�.", 8));
		div.add(new Employee("������ �.�.", 3));
		div.add(new Employee("������ �.�.", 34));
		div.add(new Employee("�������� �.�.", 312));
		div.add(new Employee("�������� �.�.", 5));
		div.add(new Employee("�������� �.", 9));
		
		prnList(div, 10);

	}
	
	public static void prnList(ArrayList A, int j){
		
		Iterator iter = A.iterator();
		
		Employee elem;
		int i=0;
		
		System.out.println("������ "+j+" ��� �� ��� ����������:\n");
		while (iter.hasNext()) {
			elem = (Employee)A.get(i); 
			if (elem.workAge >= j){
				System.out.println(elem.fio);
			}
			i++;
		}
		
	}

}
