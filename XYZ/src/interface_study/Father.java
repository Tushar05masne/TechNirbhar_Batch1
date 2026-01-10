package interface_study;

public interface Father {
	
	int i=345;
	int k=4;
	
//	public static void main(String[] args) {
//		
//		gold();
//		
//		int j=i*k;
//		
//		System.out.println(j);
//		
//	}
	
	
	
	static void gold() {
		
		System.out.println("father's Gold ");
	}
	
	
	default void money() {
		
		System.out.println("Fathers money");
		
	}
	
	void car();
	
	void plot();
}
