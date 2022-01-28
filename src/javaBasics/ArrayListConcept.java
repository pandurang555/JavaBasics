package javaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());
		
		ar.add("Tom");//5
		ar.add("Hello");//6
		ar.add(12.33);//7
		ar.add('M');//8
		ar.add(true);//9
		
		System.out.println(ar.size());
		ar.remove(9);
		System.out.println(ar.size());
		System.out.println(ar.get(9));
		
		
		
		//To print all the values of ArrayList: for loop
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//.add('M'); not allowed
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("String");
		//ar2.add(100); not allowed

	}

}
