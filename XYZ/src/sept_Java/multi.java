package sept_Java;

public class multi {
	//Addition 
	
   static int add(int a,int b) {
	return a+b;
   }
	static float add(float a, float b) {
	 return a*b;
	}
	
	// Multiply
	static int multi (int x,int y) {
		return x*y;
		
	}
    static float multi (float x,float y) {
		return x*y;
    	
    }
	
	public static void main(String[] args) {
		  System.out.println("Add (int) :" +add(12,56));
		  System.out.println("Add(float) :"+add(2.5f,3.6f));
		  
		  
		  System.out.println("Multiply(int) :" +multi(45,23));
		  System.out.println("Multiply (Float) :"+multi(4.5f,1.2f));

	}

}
