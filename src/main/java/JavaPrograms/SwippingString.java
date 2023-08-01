package JavaPrograms;

public class SwippingString {

	public static void main(String[] args) {
		String a="PQR";
		String b="XYZ";
		
		System.out.println("before: "+a+" "+b);
		a=a+b;//PQRXYZ
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("after: "+b+" "+a);

	}

}
