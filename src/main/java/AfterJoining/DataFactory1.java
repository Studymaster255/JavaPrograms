package AfterJoining;

import org.fluttercode.datafactory.impl.DataFactory;

public class DataFactory1 {

	public static void main(String[] args) {
		DataFactory df=new DataFactory();
		for(int i=0;i<=10;i++)
		{
			String name = df.getFirstName() + " "+ df.getLastName();
            System.out.println(name);
            String phone="+91"+df.getNumberText(10);
            System.out.println(phone);
            System.out.println(df.getAddress()+" "+df.getAddressLine2());
            System.out.println(df.chance(8));
            System.out.println(df.getBusinessName());
		}

	}

	

	}
