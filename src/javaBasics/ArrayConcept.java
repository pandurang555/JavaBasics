package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
	
		// 1. Static Array
		
		// disadvantages of array
		//1. size is fixed -- static array -- To overcome this problem -- we use Collections
		//   -- ArrayList, HashTable -- use Dynamic array 
		//2. stores only similar data types -- To overcome this problem , we use Object Array.
		
		
		int i[] = new int[5];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
	
		System.out.println(i[4]);
		
		System.out.println(i.length);
		for(int j=0;j<i.length;j++)
			System.out.println(i[j]);
		
		//2. Object Array
		
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "01/01/1990";
		System.out.println(ob[3]);
		
	}

}
