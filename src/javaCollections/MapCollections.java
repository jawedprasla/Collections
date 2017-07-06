package javaCollections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapCollections {

	//Creating HashMap
	public static void hashMapImp(){
		Map<Integer, String> mapHttpErrors = new HashMap<>();
		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(303, "See Other");
		mapHttpErrors.put(404, "Not Found");
		mapHttpErrors.put(500, "Internal Server Error");
		
		System.out.println(mapHttpErrors);
		
		//Getting value from map
		String status303 = mapHttpErrors.get(303);
		System.out.println("301: "+status303);
		
		//Checking value in map
		if (mapHttpErrors.containsKey("200")) {
			System.out.println("Http status 200");
		}
		
		//Removing value from map
		String removedValue = mapHttpErrors.remove(500);
		if (removedValue != null) {
			System.out.println("Removed value: " + removedValue);
		}
	}
	
	//Iterating over a map
	public static void iterateHashMap(){
		Map<String, String> mapCountryCodes = new HashMap<>();
		
		mapCountryCodes.put("1", "USA");
		mapCountryCodes.put("44", "United Kindom");
		mapCountryCodes.put("33", "France");
		mapCountryCodes.put("81", "Japan");
		
		//Iterating over key
		Set<String> setCodes = mapCountryCodes.keySet();
		Iterator<String> iterator = setCodes.iterator();
		
		while(iterator.hasNext()){
			String code = iterator.next();
			String country = mapCountryCodes.get(code);
			
			System.out.println(code + "=> "+ country);
			
		}
		
		//Iterating over value
		Collection<String> countries = mapCountryCodes.values();
		for (String country : countries){
			System.out.println(country);
		}
		
		//Iterating using entrySet()
		Set<Map.Entry<String, String>> entries = mapCountryCodes.entrySet();
		for(Map.Entry<String, String> entry : entries){
			String code = entry.getKey();
			String country = entry.getValue();
			
			System.out.println(code + " => " + country);
		}
	}
	
	//Creating a LinkedHashMap
	public static void linkedHashMapImp(){
		Map<String, String> mapContacts = new LinkedHashMap<>();
		mapContacts.put("0169238175", "Tom");
		mapContacts.put("0123456789", "Peter");
		mapContacts.put("1478523691", "Mary");
		mapContacts.put("8529637410", "John");
		
		System.err.println(mapContacts);
	}
	
	public static void treeMapImp(){
		Map<String, String> mapLang = new TreeMap<>();
		mapLang.put(".c", "C");
		mapLang.put(".java", "Java");
		mapLang.put(".pl", "Perl");
		mapLang.put(".cs", "C#");
		mapLang.put(".php", "PHP");
		mapLang.put(".cpp", "C++");
		mapLang.put(".xml", "XML");
		
		System.out.println(mapLang);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hashMapImp();
		//linkedHashMapImp();
		//treeMapImp();
		
		iterateHashMap();
	}

}
