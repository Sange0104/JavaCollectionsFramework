package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Array list are dynamic in nature
		
		ArrayList<Object>ar=new ArrayList<Object>();
		ar.add(100);
		ar.add(200);
		ar.add("testing");
		ar.add('C');
		ar.add(12.33);
		ar.add(true);
		
		System.out.println(ar);
		System.out.println(ar.size()); //6
		System.out.println(ar.get(3)); //print C
		//System.out.println(ar.get(-1)); //Array index out of bound exception
		
		System.out.println("LI " +0); //Low index is 0
		System.out.println("HI "+(ar.size()-1)); //High index is 5
		
		

	}

}
