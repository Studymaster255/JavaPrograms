package L2;

public class CharactorAlphabetOrNot {

	public static void main(String[] args) {
		char a='@';
		
		if((a>='a' &&a<='z')||(a>='A' && a<='Z'))
		{
			System.out.println(a+" Charactor is alphabet");
		}else
		{
			System.out.println(a+" Charactor is NOT alphabet");
		}

	}

}
