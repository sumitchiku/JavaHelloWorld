import java.math.BigDecimal;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("succesfully running java application");
		//primitive Data Integer
		int intergerValue = 12345;
		short intValue = 12; 
		byte itval = -124;
		long intVal = 123456789;
		System.out.println("Primitive Data Type of Short" + intValue);
		System.out.println("Primitive Data Type of Integer" + intergerValue);
		System.out.println("Primitive Data Type of Long" + intVal);
		System.out.println("Primitive Data Type of Byte" + itval);
		//primitive data Float
		float floatValue = 10f/6f;
		double doubleValue = 10d/6d;
		System.out.println("Primitive Data Type of float with precision " + floatValue);
		System.out.println("Primitive Data Type of double with precision " + doubleValue);
		//char type
		char variable1 = '\u00A7'; //go to unicode-table.com
		System.out.println("unicode symbol is dispalyed " + variable1);
		//BigDecimal
		double val1 = 1.05;
		double val2 = 2.55;
		BigDecimal d1 = new BigDecimal(val1);
		BigDecimal d2 = new BigDecimal(val2);
		System.out.println("BigDeecimal of the value is " + d1.add(d2)); 	//as it is object so we use add method
	
		BigDecimal d3 = new BigDecimal("1.05");
		BigDecimal d4 = new BigDecimal("2.55");
		System.out.println("BigDeecimal of the value is " + d3.add(d4));
		
		//string type seequence of char
		String str1 = "my name is sumit \u00BB";
		System.out.println(str1);
		
		//type casting
		//smaller to larger data type is implicit casting AKA widdining
		//larger to smaller data type is explicit casting AKA narrowing 
		
		//(a+b)^2 where a is int and b is float
		int a = 5;
		float b = 7.13f;
		double value = ((a*a) + (b*b) + (2*a*b));
		System.out.println("calue of equation is " + value);
		
		//condition statements
		int ageOfBoy = 21;
		int ageOfGirl = 18;
//		if((ageOfBoy >= 21) && (ageOfGirl >= 18)) ? System.out.println("Eligible for kalyanaam") : System.out.println(" Not Eligible for kalyanaam");
	
	}

}
