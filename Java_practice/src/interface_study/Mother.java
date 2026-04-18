package interface_study;

public interface Mother extends Father {
	
	
	
	public void land();
	
	
	public default void flat() {
		
		System.out.println("Mothers flat");
		
	}

}
