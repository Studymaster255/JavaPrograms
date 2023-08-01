package YoutubePeictise;

import java.util.HashSet;

public class DuplicateElementFromArray {
	public static void main(String[] args) {
		String a[]= {"java","selenium","cucumber","javaa","bdd","java","selenium"};
		boolean flag=false;
		/*
		//Approch 1
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					System.out.println("Found duplicate element="+a[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate element is not found");
		}
		*/
		HashSet<String> hs=new HashSet<String>();
		for(String l:a)
		{
			//System.out.println(hs.add(l));
			if(hs.add(l)==false)
			{
				System.out.println("Duplicate Element is found="+l);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate element is not found");
		}

	}
}
