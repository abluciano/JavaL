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

		div.add(new Employee("������ �.�.", 12));
		div.add(new Employee("����� �.�,", 1));
		div.add(new Employee("������� �.�.", 8));
		div.add(new Employee("������ �.�.", 3));
		div.add(new Employee("������ �.�.", 34));
		div.add(new Employee("�������� �.�.", 312));
		div.add(new Employee("�������� �.�.", 5));
		div.add(new Employee("�������� �.", 9));

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
