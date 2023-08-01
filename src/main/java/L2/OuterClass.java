package L2;

public class OuterClass {

	
	    protected int protectedVar = 10;

	    public class InnerClass {
	        public void accessProtectedVar() {
	            // Accessing the protected variable within the inner class
	            int value = protectedVar;
	            System.out.println("Protected variable in InnerClass: " + value);
	        }
	    }

	    public void accessProtectedVar() {
	        // Attempting to access the protected variable from the outer class
	        int value = protectedVar; // This is allowed
	        System.out.println("Protected variable in OuterClass: " + value);
	    }
	    
	    public static void main(String[] args) {
	        OuterClass outerObj = new OuterClass();
	        OuterClass.InnerClass innerObj = outerObj.new InnerClass();

	        outerObj.accessProtectedVar(); // Accessing from the outer class
	        innerObj.accessProtectedVar(); // Accessing from the inner class
	    }
	}

