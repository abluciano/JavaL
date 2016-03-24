package pack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Run {

	public static void main(String[] args) {

		ArrayList<Employee> div = new ArrayList<Employee>();
		Set<Integer> set1 = new LinkedHashSet<>();
		Set<Integer> set2 = new LinkedHashSet<>();

		div.add(new Employee("Иванов И.И.", 12));
		div.add(new Employee("Перов П.П,", 1));
		div.add(new Employee("Сидоров С.С.", 8));
		div.add(new Employee("Чапаев В.И.", 3));
		div.add(new Employee("Вейдер Д.М.", 34));
		div.add(new Employee("Хоттабыч Г.А.", 312));
		div.add(new Employee("Николаев В.С.", 5));
		div.add(new Employee("Гермиона Г.", 9));

		HashSet<Employee> div1 = new HashSet<Employee>(div);
		/*
		 * Queue<Employee> div2 = new PriorityQueue<>();
		 * 
		 * for(int i=0; i <= div.size(); i++ ){ div2.add((Employee) div.get(i));
		 * }
		 * 
		 */

		WorkSet.fillSet(set1, 5, 12);
		WorkSet.fillSet(set2, 5, 10);
		System.out.println(set1);
		System.out.println(set2);
		WorkSet.union(set1, set2);
		WorkSet.intersect(set1,set2);

		WorkSet.prnList(div, 10);
		WorkSet.prnList(div1, 10);

	}

}
