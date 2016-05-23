package mbank.szczepan.cw12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import static org.apache.commons.lang3.StringUtils.isNotBlank;


public class SortedPersons {
 
	public static void main(String[] args) {
		
		Person person1 = new Person("Andrzej", "Kowalski");
		Person person2 = new Person("Micha³", "Kowalski");
		Person person3 = new Person("Boles³aw", "Janowski");
		Person person4 = new Person("Boles³aw", "Tarnowski");

		List<Person> list = new ArrayList<>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		
		/**
		 * Pierwsza klasa anomimowa sortowanie przez FirstName()
		 */
	/*	Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});*/
		
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return new CompareToBuilder()
				.append(o1.getFirstName(), o2.getFirstName())
				.append(o1.getLastName(), o2.getLastName())
				.toComparison(); 
			}
		}); 
		for (Person p : list) {
			System.out.println(p.getFirstName() + " " + p.getLastName());
		}
		System.out.println(" ------------------------");
		
		/**
		 * Klasa anomimowa new Comparator
		 * sortowanie przez zmienn¹ getLastName(); 
		 */
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName()); 
			}

		}); 
		for (Person p : list) {
			System.out.println(p.getFirstName() + " " + p.getLastName());
		}
		
		
	}
	
	

}
