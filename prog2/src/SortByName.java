import java.util.Comparator;

public class SortByName  implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		Student s1=(Student)o1;
		Student s2=(Student)o2;

		return s1.getName().compareTo(s2.getName());
	}

}
