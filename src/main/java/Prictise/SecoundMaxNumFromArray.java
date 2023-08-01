package Prictise;

public class SecoundMaxNumFromArray {

	public static void main(String[] args) {
		int a[]= {20,10,30};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];			//20
					a[i]=a[j];			//10
					a[j]=temp;			//20
				}
			}
		}
		for(int v:a)
		{
			System.out.println(v);
		}
		System.out.println("2nd max no="+a[a.length-2]);
	}

}
