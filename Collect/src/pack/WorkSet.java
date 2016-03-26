package pack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;

public abstract class WorkSet {

	public static void fillSet(Set A, int len, int j) {

		for (int i = 0; i < len; i++) {
			A.add(i + j);
		}

	}

	public static void prnList(Collection A, int j) {

		Iterator iter = A.iterator();

		Employee elem;

		System.out.println("Больше " + j + " лет на нас отработали:\n");
		while (iter.hasNext()) {
			elem = (Employee) iter.next();
			if (elem.workAge >= j) {
				System.out.println(elem.fio);
			}

		}

	}

	public static void union(Set A, Set B){
		ArrayList<Integer> res = new ArrayList<>();
		Iterator itA = A.iterator();
		Iterator itB = B.iterator();
		
		while(itA.hasNext()){
			res.add((Integer) itA.next());
		}
		
		while(itB.hasNext()){
			res.add((Integer) itB.next());
		}
		
		System.out.println("Объединение множеств: "+res);
		
	}
	
	public static void intersect(Set A, Set B){
		
		ArrayList<Integer> res = new ArrayList<>();
		ArrayList<Integer> forB = new ArrayList<>();
		Iterator itA = A.iterator();
		Iterator itB = B.iterator();
		int a,b;
		
		while(itB.hasNext()){
			forB.add((Integer) itB.next());
		}
		
		while(itA.hasNext()){
			a = (int)itA.next();
			for(int i=0; i<forB.size();i++){
				b = forB.get(i);
				if(a == b){
					res.add(a);
				}
			}
		}
		
		System.out.println("Пересечение множеств: "+res);
	}
	

	
}