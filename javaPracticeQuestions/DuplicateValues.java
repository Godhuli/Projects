package javaPracticeQuestions;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//How to find duplicate values in an array?

public class DuplicateValues {

	public static void main(String[] args) {
		
		
		
		//bad approach compare each value in an array
	String names []= {"Daisy", "Rose", "Dafodill", "Rose", "Daisy", "Rose"};

	/*
	for (int i=0;i<names.length;i++){
		for (int j=i+1;j<names.length;j++){
			if (names[i].equals(names[j])){
				System.out.println("Duplicate value is: "+ names[i]);
				
			}
		}
	}
	
	*/
	
	
	//Second approach using has set. Hash set stores unique values, no duplicates
	
	Set<String> storeName = new HashSet<String>();
	for (String name:names){
		if (storeName.add(name)== false){
			System.out.println("The duplicate element is: "+name);
		}
	}
	
	
	
	
	//third method is by using hashmap
	HashMap <String, Integer> hm = new HashMap<String, Integer>();
	for (String name:names){
		Integer count= hm.get(name);
		if (count == null){
			hm.put(name,1);
		}
		else
			hm.put(name, ++count);
	}
	
	
	
	Set<java.util.Map.Entry<String, Integer>>entry= hm.entrySet();
	for (java.util.Map.Entry<String, Integer> eachEntry:entry){
		if (eachEntry.getValue()>1){
			System.out.println("Duplicate element is: "+eachEntry.getKey());
		}
		}
		
	}
	

	}

