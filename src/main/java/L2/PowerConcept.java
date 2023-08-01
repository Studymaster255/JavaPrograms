package L2;

public class PowerConcept {

	public static void main(String[] args) {
		int base=2;
		
		int exeponent=4;
		int orgExe=exeponent;
		long result=1;
		
		while(exeponent!=0)
		{
			result*=base;
			--exeponent;
		}
		System.out.println(""+base+" power "+orgExe+" = "+result);
		System.out.println(Math.pow(base,exeponent));
	}

}
