/**
 * 
 */
package JavaPrograms;

/**
 * @author Itsme
 *
 */
public class AddInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num=123456;
		int sum=0;
		String numStr=Integer.toString(num);
		for(int i=0;i<numStr.length();i++)
		{
			char digitChar=numStr.charAt(i);
			int digit=Character.getNumericValue(digitChar);
			sum +=digit;
		}
		System.out.println("sum of digit = "+sum);
	}

}
