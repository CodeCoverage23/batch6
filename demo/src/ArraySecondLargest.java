import java.util.Arrays;

public class ArraySecondLargest {
	public static void array() {
		double a[]= {27,81,186,33,157,96,170,66};
		//using sort method
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			
		}
		System.out.println("the second largest number is:"+a[a.length-2]);
		//without using sort method
		double temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("the third largest no.is: "+a[a.length-3]);
	}
	
	
public static void main(String[] args) {
	array();
}
}
