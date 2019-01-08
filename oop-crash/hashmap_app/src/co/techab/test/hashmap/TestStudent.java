package co.techab.test.hashmap;

import java.util.HashMap;
import java.util.Map;

import com.techlab.hashmap.Student;

public class TestStudent {
	public static void main(String[] args) {
		Map<Object, Object> hmap;
		hmap = new HashMap<Object, Object>();

		Student student1 = new Student(1, 101, "nikita", "jadhav");
		Student student2 = new Student(1, 101, "trupti", "mahale");
		Student student3 = new Student(2, 102, "aditya", "jadhsv");
		Student student4 = new Student(2, 105, "nikhil", "jadhav");
		Student student5 = new Student(3, 102, "aditya", "jadhav");
		hmap.put(student1, student1);
		hmap.put(student2, student2);
		hmap.put(student3, student3);
		hmap.put(student4, student4);
		hmap.put(student5, student5);
		System.out.println("Add:-");
		for (Map.Entry<Object, Object> entry : hmap.entrySet()) {
			System.out.println(entry.getKey());
			// +" "+entry.getValue());
		}

		hmap.remove(student5);
		System.out.println("Delete:-");
		for (Map.Entry<Object, Object> entry : hmap.entrySet()) {
			System.out.println(entry.getKey());
			// +" "+entry.getValue());
		}

	}

}
