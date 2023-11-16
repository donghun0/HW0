import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		// 정수 값만 다루는 generic ArrayList 생성
		ArrayList<Integer> v = new ArrayList<Integer>();
		v.add(27);		// insert 27
		v.add(45);		// insert 45
		v.add(54);		// insert 54
		v.add(1, -36);	// insert -36 between 27 and 45
		
		// print all the integer elements in the ArrayList
		// using Iterator
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		// add all the elements using Ieterator
		int sum = 0;
		it = v.iterator();		// acquire iterator object // it = v.iterator();일시 sum 값은 0 
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		
		System.out.println("Sum of the elements in the ArrayList : " + sum);

	}

}
