import java.util.ArrayList;
import java.util.Collections;

public class Presentation {

	public static void main(String[] args) {
		 ArrayList<Student> ar = new ArrayList<Student>();
	        ar.add(new Student("usha", 21, 5.0));
	        ar.add(new Student("bhanu", 19, 6.0));
	        ar.add(new Student("mahi", 18, 4.0));
	 
	 
	        Collections.sort(ar, new SortByAge());
	 
	       System.out.println("Sorted by age");
	        for (int i=0; i<ar.size(); i++)
	            System.out.println(ar.get(i));
	 
	        Collections.sort(ar, new SortByName());
	 
	        System.out.println("Sorted by name");
	        for (int i=0; i<ar.size(); i++)
	            System.out.println(ar.get(i));

	}

}
