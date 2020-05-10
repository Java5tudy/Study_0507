package javastudy;
import java.util.Arrays;

class Person implements Comparable {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		if(this.name.length() > p.name.length())
			return 1;
		else if(this.name.length() <p.name.length())
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return (name + ":" + age);
	}
}

public class ArrayObjectSort20_2_2 {
	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("Lily", 29);
		ar[1] = new Person("George", 15);
		ar[2] = new Person("Sam", 37);
		
		Arrays.sort(ar);
		for(Person p : ar)
			System.out.println(p);
	}

}