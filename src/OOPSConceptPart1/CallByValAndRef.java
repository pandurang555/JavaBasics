package OOPSConceptPart1;

public class CallByValAndRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		CallByValAndRef obj = new CallByValAndRef();
		int sum = obj.testSum(25, 30); //Call by Value or Pass by value
		System.out.println(sum);
		
		obj.p=50;
		obj.q=60;
		//Before Swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		obj.swap(obj);
		// After Swap
		System.out.println(obj.p);
		System.out.println(obj.q);

	}
	
	public int testSum(int a, int b) {
		a=90;
		b=10;
		int c = a+b;
		return c;
		
	}
	
	//call by reference  
	public void swap(CallByValAndRef t) {
		int temp;
		temp = t.p; //temp = 50
		t.p = t.q; // t.p=60
		t.q = temp;// t.q=50
		
	}

}
