package exception_handling;

public class GC_Finalize_use1 {

	
	    @Override
	    protected void finalize() throws Throwable {
	        System.out.println("Finalize method called before  GC destroys object");
	    
	    }
	    public static void main(String[] args) {
	    	
	    	GC_Finalize_use1 d = new GC_Finalize_use1();
	        d = null; // make object eligible for GC
	        System.gc(); // request garbage collection
	        System.out.println("Main method ends");
	    }
	}


