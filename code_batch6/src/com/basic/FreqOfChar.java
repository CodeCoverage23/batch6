package com.basic;

public class FreqOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		String name="Rushikesh Pande";
		int length=name.length();
		int []freq=new int[length];
		char[] arr = name.toCharArray();
		for(i=0;i<name.length();i++) {
			int count=1;
			for(j=i+1;j<name.length();j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=0;
					
				}
			}
			freq[i]=count;
		}
      System.out.println("character\tfrequency");
      for(i=0;i<freq.length;i++) {
    	  
      
      if(arr[i]!=0 && arr[i]!=' ') {
    	  System.out.println(arr[i]+"\t\t"+freq[i]);
    	  
      }
	}

}
}