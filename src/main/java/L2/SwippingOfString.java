package L2;

public class SwippingOfString {

	public static void main(String[] args) {
		String a="Swapnil";
		String b="Shingate";
		
		System.out.println("Before swipping :"+a+" <<AND>> "+ b+"\n");
		a=a+b;
		System.out.println(a+"\n");
		b=a.substring(0, a.length()-b.length());
		System.out.println(b+"\n");
		a=a.substring(b.length());
		System.out.println(a+"\n");
		
		System.out.println("After swipping :"+a+" <<AND>> "+ b);
	}

}
