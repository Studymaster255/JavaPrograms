package Prictise;

public class AlphabeticOrder {

	public static void main(String[] args) {
		String a="swapnilshingate";
		char temp=' ';
		char [] ch=a.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		for(char v:ch)
		{
			System.out.print(v+" ");
		}
	}

}
