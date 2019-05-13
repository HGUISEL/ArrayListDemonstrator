package edu.handong.csee.java.example;

import java.util.*;

public class HashMapExample {

	String[] data = {"ITP20006,JC NAM",
			"ITP20006,JD Kim",
			"ITP20006,JE Park",
			"ITP20006,JF Seo",
			"ITP40001,HA Seo",
			"ITP40002,HA Park",
	"ITP40002,HW Nam"};

	public static void main(String[] args) {
		HashMapExample example = new HashMapExample();
		example.run();
	}

	private void run() {

		HashMap<String,ArrayList<String>> namesByCourse = new HashMap<String,ArrayList<String>>();

		for(String line:data) {
			String[] values = line.split(",");
			String courseCode = values[0];
			String studentName = values[1];

			if(namesByCourse.containsKey(courseCode)) {
				namesByCourse.get(courseCode).add(studentName);
			} else {
				ArrayList<String> names = new ArrayList<String>();
				names.add(studentName);
				namesByCourse.put(courseCode, names);

			}
		}

		Map<String, ArrayList<String>> sortedMap = new TreeMap(namesByCourse);


		for(String key:sortedMap.keySet()) {

			System.out.println(key + " " + namesByCourse.get(key).size());

			/*for(String name:namesByCourse.get(key)) {
				System.out.println(key + " " + name);
			}*/

		}

	}

}
