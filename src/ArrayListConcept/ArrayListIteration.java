package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
	
		ArrayList<String> studentList = new ArrayList<String>();
		
		studentList.add("Tom");
		studentList.add("Sang");
		studentList.add("Lisa");
		studentList.add("Steve");
		
		System.out.println("*---------*");
		
		//Iterating the list
		//Typical for Loop
		
		for(int i=0;i<studentList.size();i++)
		{
			System.out.println(studentList.get(i));
		}
		System.out.println("*---------*");
		
		//Typical for each loop
		
		for(String s : studentList)
		{
			System.out.println(s);
		}
		
		System.out.println("*---------*");
		
		//Iterator
		Iterator<String> it = studentList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("*---------*");
		
		//Getting the array list from another list
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(numbers);
		
		System.out.println("*---------*");
	
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Java","Python","PHP","Selenium"));
		System.out.println(names);
		System.out.println(names.size());
	}
	

}
