package YoutubePeictise;

import java.util.Random;

public class GenerateERandomNumberAndString {

	public static void main(String[] args) {
		Random rand=new Random();
		for(int i=0;i<=10;i++)
		{
			int rand_int=rand.nextInt(100);
			System.out.println(rand_int);
			System.out.println("=========================");
			System.out.println(rand.nextDouble());
			System.out.println("=========================");
			System.out.println(rand.nextDouble(12));
			System.out.println("=========================");
			System.out.println(rand.nextGaussian());
			System.out.println("=========================");
			System.out.println(rand.nextInt(100));
			System.out.println("=========================");
			System.out.println(rand.nextLong());
			System.out.println("=========================");
			System.out.println(Math.random());
		}
		//System.out.println(Math.random());
		

	}

}
