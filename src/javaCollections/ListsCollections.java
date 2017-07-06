package javaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListsCollections {
	
	//Defining array list
	public static void arrayListExample(){
		
		List<String> listString = new ArrayList<>();
		listString.add("One");
		listString.add("Two");
		listString.add("Three");
		listString.add("Four");
		listString.add(4, "added");
		
		System.out.println("Printing list values "+listString);
		System.out.println("");
		System.out.println("Getting list size "+listString.size());
		System.out.println("");
		String three = listString.get(3);
		
		System.out.println("Getting value at 3rd position "+three);
		System.out.println("");
		
		if(listString.remove("added")){
			System.out.println("Removed");
			System.out.println("");
		} else{
			System.out.println("There is no such element");
			System.out.println("");
		}
		
		System.out.println(listString);
		System.out.println("");
	}
	
	//Defining link list
		public static void linkListExample(){
			List<String> listString2 = new LinkedList<>();
			listString2.add("Five");
			listString2.add("Six");
			listString2.add("Seven");
			
			System.out.println(listString2);
			System.out.println("");
			
			List<String> listString3 = new ArrayList<>(listString2);
			
			System.out.println(listString3);
			System.out.println("");
			
			String Six = listString2.get(1);
			System.out.println("Getting sixth element :"+Six);
			System.out.println("");
			
			LinkedList<Number> numbers = new LinkedList<Number>();
			numbers.add(new Integer(1));
			numbers.add(new Integer(2));
			numbers.add(new Integer(3));
			
			Number first = numbers.getFirst();
			Number last = numbers.getLast();
			
			System.out.println("Example of getFirst :"+ first);
			System.out.println("");
			System.out.println("Example of getLast :"+ last);
			System.out.println("");
		}
		
		
	//Iterating through list
	public static void iteratingList(){
		List<String> listString = new ArrayList<>();
		listString.add("One");
		listString.add("Two");
		listString.add("Three");
		listString.add("Four");
		
		for(String element : listString){
			System.out.println(element);
		}
		
		System.out.println("");
		
		Iterator<String> iterator = listString.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			System.out.println("");
		}
		
		//Since Java 8, we can use the forEach()method like this:
		//listString.forEach(s -> System.out.println(s));
	}
	
	
	//Searching for an element in a list
	public static void searchList(){
		
		List<String> listString = new LinkedList<>();
		listString.add("Hello");
		listString.add("How");
		listString.add("Hey");
		listString.add("Hi");
		listString.add("How");
		listString.add("Hey");
		
		if(listString.contains("Hi")){
			System.out.println("found value");
			System.out.println("");
		} else {
			System.out.println("Not found");
			System.out.println("");
		}
		
		int firstIndex = listString.indexOf("Hi");
		System.out.println(firstIndex);
		System.out.println("");
		
		int lastIndex = listString.lastIndexOf("Hey");
		System.out.println(lastIndex);
		System.out.println("");
	}

	public static void sortingList(){
		List<String> listStrings = new ArrayList<String>();
		listStrings.add("D");
		listStrings.add("C");
		listStrings.add("E");
		listStrings.add("A");
		listStrings.add("B");
		 
		System.out.println("listStrings before sorting: " + listStrings);
		 
		Collections.sort(listStrings);
		 
		System.out.println("listStrings after sorting: " + listStrings);
	}
	
	//Extracting sublist
	public static void subList(){
		List<String> listNames = Arrays.asList("Tom", "John", "Mary", "Peter", "David", "Alice");
		System.out.println("Original list: " + listNames);
		 
		List<String> subList = listNames.subList(2, 5);
		System.out.println("Sub list: " + subList);
	}
	
	public static void concurrentList(){
		
		List<Object> unsafeList = new ArrayList<Object>();
		List<Object> safeList = Collections.synchronizedList(unsafeList);
		
		synchronized (safeList) {
		    Iterator<Object> it = safeList.iterator();
		    while (it.hasNext()) {
		        System.out.println(it.next());
		    }
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//arrayListExample();
		
		//linkListExample();
		
		//iteratingList();
		
		//searchList();
		//sortingList();
		subList();
	}

	
}
