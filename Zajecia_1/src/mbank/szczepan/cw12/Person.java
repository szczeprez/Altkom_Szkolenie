package mbank.szczepan.cw12;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Person implements Comparable<Person>{
	private String firstName;
	private String lastName;

	@Override
	public int compareTo(Person person) {
		int firstNameComarable = firstName.compareTo(person.firstName); 
		if(firstNameComarable != 0){
			return firstNameComarable; 
		}
		
		return lastName.compareTo(person.lastName);
	}
	
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}

/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}*/
/* U¿yta metoda hashCodeBuilder z apache.commons
	@Override
	public int hashCode() {
		return new HashCodeBuilder(1, 31)
		.append(firstName)
		.append(lastName).toHashCode(); 
	}*/
	
	/**
	 * U¿ycie reflekcji i statycznej metody reflectionHashCode.
	 */
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this); 
	}
	
/*	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}*/
/*	@Override
	public boolean equals(Object obj) {
		if(obj == null ){return false;}
		if(obj == this) {return true; }
		if(obj.getClass() != getClass()){
			return false;
		}
		Person per = (Person) obj; 
		return new EqualsBuilder()
		.append(firstName, per.firstName)
		.append(lastName, per.lastName)
		.isEquals();
	}*/
	
	// U¿ycie metody reflekcji z apaache commons.
	@Override
	public boolean equals(Object obj) {
	    return  EqualsBuilder.reflectionEquals(this,obj); 
	}

}
