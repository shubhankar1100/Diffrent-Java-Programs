package lambdaExp;

import java.awt.print.Printable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingJava7 {

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
Collections.sort(people, new Comparator<Person>() {
@Override
public int compare(Person o1,Person o2){
	return o1.getLastName().compareTo(o2.getLastName());
}


});

printAll(people);




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
