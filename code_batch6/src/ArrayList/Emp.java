package ArrayList;

public class Emp implements Comparable<Emp>{
	
	int id;
	double salary;
	String name;
	public Emp(int id, String name, double salary)
	{
		super();
		this.id= id;
		this.name = name;
		this.salary = salary;
		
	}

	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary+"]";
	}


	@Override
	public int compareTo(Emp o) 
	{
	   if(id==o.id)
		   return 0;
		
		 else if(id>o.id)
			return 1;
	
		else
			return -1;
	}

}

