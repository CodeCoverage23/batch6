package Java8;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String args[])
	{
		ArrayList<Employee> l=new ArrayList<>();
		
		l.add(new Employee(101, "akshay", 23000));
		l.add(new Employee(102, "ajay", 23420));
		l.add(new Employee(103, "kamlesh", 75000));
		l.add(new Employee(104, "vijay", 87000));
		
		
		Predicate<Employee> p1 = e->e.salary>30000;
		Function<Employee, Long> f = s->s.salary+5000;
		for (Employee e1:l)
		{
			if(p1.test(e1))
			{
				System.out.println("id=" +e1.id+  "  name = "+e1.name+ " salary=" + f.apply(e1));
				
			}	
		}			
	}	
}
