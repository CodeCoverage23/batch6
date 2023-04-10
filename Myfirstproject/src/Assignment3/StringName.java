package Assignment3;

public class StringName {
	
	String studentname;
	
public StringName ( String studentname) {
		
	      this.studentname=studentname;
		}
	
		
public static void main(String[] args) {
	
	StringName s1 = new StringName("sakshi");
	
		System.out.println(s1);
	
    }


@Override
public String toString() {
	return "StringName [studentname=" + studentname + "]";
}


}

