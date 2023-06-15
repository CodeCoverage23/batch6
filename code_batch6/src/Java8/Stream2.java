package Java8;
import java.util.*;
import java.util.stream.Collectors;

public class Stream2 {

	public static void main(String[] args) {
		
		ArrayList<Student> s1 = new ArrayList<>();
		
		s1.add(new Student(101, "Akshay", 78, "akahay@gmail.com"));
		s1.add(new Student(105, "Ajay", 89, "ajay12@gmail.com"));
		s1.add(new Student(103, "Gnesh", 76, "ganesh1234@gail.com"));
		s1.add(new Student(104, "Ajay", 67, "pawan2611@gmail.com"));
		
		List<Student> collect = s1.stream().filter(e -> e.studentMarks>=70).collect(Collectors.toList());
		s1.stream().filter(e->e.studentName=="Ajay").forEach(System.out::print);
		List<Float> collect1 =s1.stream().map(m ->m.studentMarks+5).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println(collect1);
		long count1= s1.stream().count();
		System.out.println(count1);
	//	s1.stream().sorted((a1, a2)->a1.studentName.compareTo(a2.studentName)).forEach(System.out::println);
		s1.stream().sorted((a1,a2)->(a1. studentId<a2.studentId)?-1:(a1. studentId>a2.studentId)?1:0).
		forEach(System.out::println);
		
		}	
}
