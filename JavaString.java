package mypackage;

public class JavaString {

	public static void main(String[] args) {

		 String country = new String("Nepal");
		 System.out.println(country);
		 String greeting = "SWAGATAM";
		 System.out.println(greeting);


		 String city= "KATHMANDU";
		 int length = city.length();
		 System.out.println(length);
		

		 String a1 = "United States America";
		 String a2 = "United States";
		if(a1==a2) {
			System.out.println("Void");
		}else {
			System.out.println("not match");
		}
		
		System.out.println(a1);
		 System.out.println(a2);
		 System.out.println(a1.compareTo(a2));
		 System.out.println(a2.isEmpty());
		 System.out.println(a1.isEmpty());
	
		System.out.println(city.toLowerCase());
		
		System.out.println(a1.toUpperCase());
		

	}

}
