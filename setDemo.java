package collectionspractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> javaStudents = new HashSet<String>();
		javaStudents.add("Nikhil");
		javaStudents.add("Suresh");
		javaStudents.add("Nishant");
		javaStudents.add("Ajaya");
		javaStudents.add("Bhandari");
		javaStudents.add("Lok");
		javaStudents.add("Sandesh");
		javaStudents.add("Laxmi");
		javaStudents.add("Rohan");
		javaStudents.add("Purnima");
		javaStudents.add("Koirala");

		// System.out.println(javaStudents);
		Iterator<String> myItr = javaStudents.iterator();
		while (myItr.hasNext()) {
			String element = myItr.next();
			System.out.println(element);
		}

		for (String name : javaStudents) {
			System.out.println(name);
		}

		javaStudents.forEach(System.out::println);
	}
}
