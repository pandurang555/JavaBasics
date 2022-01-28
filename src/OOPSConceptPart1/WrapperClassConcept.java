package OOPSConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x = "100";
        //data conversion : String to integer:
		int i = Integer.parseInt(x);

		System.out.println(i+20);
	
		//Integer , Double, Character, Boolean //
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+12.33);
	
		//String to boolean:
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		// int to String conversion
		int j = 200;
		System.out.println(j+20);
		
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		
		String u = "100A";
		Integer.parseInt(u);// Number format exception//
		
		
		
	}

}
