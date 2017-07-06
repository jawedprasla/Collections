package javaCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class SetCollections {

	public static void hashSetImpl(){
		
		Set<Integer> numbers = new HashSet<>();
		
		List<Integer> listInteger = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
		System.out.println(listInteger);
		Set<Integer> setInteger = new HashSet<>(listInteger);
		System.out.println(setInteger);
	}
	
	public static void linkedHashSet(){
		Set<String> name = new LinkedHashSet<>();
		List<Integer> listInteger = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
		System.out.println(listInteger);
		Set<Integer> setInteger = new LinkedHashSet<>(listInteger);
		System.out.println(setInteger);
		
	}
	
	public static void treeSet(){
		Set<String> name = new TreeSet<>();
		List<Integer> listInteger = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
		System.out.println(listInteger);
		Set<Integer> setInteger = new TreeSet<>(listInteger);
		System.out.println(setInteger);
	}
	
	//Adding element in set	
	public static void addHashSet(){
		Set<String> names = new HashSet<>();
		names.add("John");
		names.add("Mary");
		
		if(names.add("Peter")){
			System.out.println("Peter is added to the set");
		} else {
			System.out.println("Peter is added to the set");
		}
		if(!names.add("John")){
			System.out.println("John is already added to the set");
		}
		
	}
	
	//Remove element from Set
	public static void removeHashSet (){
		Set<String> names = new HashSet<>();
		names.add("John");
		names.add("Mary");
		
		if(names.remove("John")){
			System.out.println("John is removed");
		}else {
			System.out.println("John is alredy remvoed");
		}
	}
	
	//Check if Set is empty
	public static void checkEmpty(){
		Set<String> names = new HashSet<>();
		names.add("John");
		names.add("Mary");
		
		if(names.isEmpty()) {
			System.out.println("The set is empty ");
		} else {
			System.out.println("The set is not empty");
		}
		
	}
	
	//Iterating over elements in Set
	public static void setIterator(){
		Set<String> names = new HashSet<>();
		names.add("Tom");
		names.add("Mary");
		names.add("John");
		names.add("Peter");
		names.add("Alice");
		
		Iterator<String> iterator = names.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("Using enhanced for loop iterator");
		
		for(String name : names){
			System.out.println(name);
		}
		
	}
	
	public static void UnionOperation(){
		Set<Integer> s1 = new HashSet<>(Arrays.asList(20, 56, 89, 31, 8, 5));
		Set<Integer> s2 = new HashSet<>(Arrays.asList(89, 8));
		Set<Integer> s3 = new HashSet<>(Arrays.asList(2, 3, 4, 6));
		//Subset Operation
		if(s1.containsAll(s2)){
			System.out.println("s2 is a subset of s1");
		}
		
		//Union Operation
		s1.addAll(s3);
		System.out.println("s1 after union: " + s1);
		
		//Intersection Operation
		System.out.println("s1 before intersection: " + s1);

		s1.retainAll(s2);

		System.out.println("s1 after intersection: " + s1);
	}
	
	//To make set thread safe it need to be synchronized
	public static void concurrentSet(){
		Set<Integer> numbers = Collections.synchronizedSet(new HashSet<Integer>());
		
		synchronized (numbers) {
			Iterator<Integer> iterator = numbers.iterator();

			while (iterator.hasNext()) {
				Integer number = iterator.next();
				System.out.println(number);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hashSetImpl();
		System.out.println("");
		linkedHashSet();
		System.out.println("");
		treeSet();
		
		addHashSet();
		setIterator();
	}

}
