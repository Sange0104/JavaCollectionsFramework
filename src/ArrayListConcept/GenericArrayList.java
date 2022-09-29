package ArrayListConcept;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		// How to define the generic arrays
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		marks.add(30);
		marks.add(3);
		//marks.remove(1);
		System.out.println(marks);

		ArrayList<Double> arD = new ArrayList<Double>();
		arD.add(30.34);
		
		ArrayList<String> student = new ArrayList<String>();
		student.add("Yong");
		student.add("Kim");
	}

}
