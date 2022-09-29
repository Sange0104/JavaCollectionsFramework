package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		//Combining 2 array lists
		
		ArrayList<String>ar1 = new ArrayList<String>();
		
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("Ruby");
		
		ArrayList<String>ar2 = new ArrayList<String>();
		
		ar2.add("Php");
		ar2.add("C#");
		ar2.add("Javascript");
		
		//ar1.addAll(ar2);
		//System.out.println(ar1);
		
		//ar1.addAll(2, ar2);   //print as per the index position
		//System.out.println(ar1);

		//ar1.clear();			// This will clear the array
		//System.out.println(ar1);
		
		//Clone array	
		ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
		System.out.println(cloneList);
		
		//contains method
		System.out.println(ar1.contains("Ruby"));
		System.out.println(ar1.contains("Test"));
		
		System.out.println(ar1.indexOf("ruby")>0); //this will tell the index position is greater or not.True
		
		
		//Last index position of string given
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("N","T","L","L"));
		int i = list.lastIndexOf("L");
		System.out.println(i);
		
		//to remove value from arraylist
		list.remove(1);
		list.remove("L");
		System.out.println(list);
		
		//Given a list remove all even numbers and print only odd numbers
		ArrayList <Integer> numbers = new ArrayList <Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		numbers.removeIf(num ->(num%2==0));
		System.out.println(numbers);
		
		//Given a list remove all odd numbers and print only even numbers
		ArrayList <Integer> numbers1 = new ArrayList <Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		numbers1.removeIf(num ->(num%2==1));
		System.out.println(numbers1);
		
		//RetainAll method - This will retain only the string mentioned in the array
		
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("N","T","L","L"));
		nameList.retainAll(Collections.singleton("L"));
		System.out.println(nameList);
		
		//To get sublist from the list
		
		ArrayList <Integer> numbers2 = new ArrayList <Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		ArrayList <Integer> subList = new ArrayList <Integer>(numbers2.subList(2, 6));
		System.out.println(subList);
		
		//ArrayList to array method
		
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList("N","t","L","L"));
		Object arr[] = newList.toArray();
		System.out.println(Arrays.toString(arr));
		
		for(Object o:arr) {
			System.out.println(o);
		}
	}

}
