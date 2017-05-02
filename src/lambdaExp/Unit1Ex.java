package lambdaExp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(
				new Person("zx","fg",56),
				new Person("sadas","fdfsg",76),
				new Person("asd","fzdfg",36),
				new Person("ad","frhg",5),
				new Person("zfdx","sdffg",6)
				
				);
			//sort the list by last name
Collections.sort(people, (o1,o2)-> o1.getLastName().compareTo(o2.getLastName()));

people.forEach(System.out::println);




		//crate a method that print all elements

		//last name srart witj s

printLastNameStartWithS( people);
	}
	
	private static void printLastNameStartWithS(List<Person> people){
		for(Person p : people){
			if(p.getLastName().startsWith("s"))
			System.out.println(p);
		}
	}
	
	private static void printAll(List<Person> people){
		for(Person p : people){
			System.out.println(p);
		}

	}

}
