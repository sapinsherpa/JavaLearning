package javaCollection;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> myExam = new HashMap<Integer, String>();

		myExam.put(80, "Math");
		myExam.put(78, "Opt.Math");
		myExam.put(76, "English");
		myExam.put(59, "Social");
		myExam.put(81, "English");
		myExam.put(341, "Nepali");
		myExam.put(341, "Science");
		myExam.put(341, "Account");
		
		System.out.println(myExam.size());

		System.out.println(myExam);

		// ctrl+shift+O to import package

	}

}
