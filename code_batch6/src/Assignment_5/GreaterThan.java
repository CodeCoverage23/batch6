package Assignment_5;

public class GreaterThan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i,j,sum=0;
n=100;
for(i=1;i<=n;i++)
{
	for(j=1;j<=n;j++)
	{
		if(i%j==0)
		{
			sum=sum+j;
		}
	}
	if(sum>i)
		System.out.println(i+" ");
	sum=0;
}
	}

}
