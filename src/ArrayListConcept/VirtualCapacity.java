package ArrayListConcept;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		// Important topic in array list
		
		//default virtual capacity is 10
		//physical capacity is nothing but the size of the array list
		
		ArrayList<Object>ar = new ArrayList<Object>(); //if you give like ArrayList<Object>ar = new ArrayList<Object>(20) then 0to19 VC will be created
		System.out.println(ar.size());  //PC =0
		
		ar.add(100);
		System.out.println(ar.size()); //PC =1  VC =10
		
		ar.add(200);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size()); //PC=4

	}

}
