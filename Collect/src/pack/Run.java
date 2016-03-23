package pack;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Run {

	public static void main(String[] args) {
		
		ArrayList div = new ArrayList();
	//	HashSet div = new HashSet();
		
		div.add(new Employee("Иванов И.И.", 12));
		div.add(new Employee("Перов П.П,", 1));
		div.add(new Employee("Сидоров С.С.", 8));
		div.add(new Employee("Чапаев В.И.", 3));
		div.add(new Employee("Вейдер Д.М.", 34));
		div.add(new Employee("Хоттабыч Г.А.", 312));
		div.add(new Employee("Николаев В.С.", 5));
		div.add(new Employee("Гермиона Г.", 9));
		
		prnList(div, 10);

	}
	
	public static void prnList(ArrayList A, int j){
		
		Iterator iter = A.iterator();
		
		Employee elem;
		int i=0;
		
		System.out.println("Больше "+j+" лет на нас отработали:\n");
		while (iter.hasNext()) {
			elem = (Employee)A.get(i); 
			if (elem.workAge >= j){
				System.out.println(elem.fio);
			}
			i++;
		}
		
	}

}
