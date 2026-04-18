package interface_study;

public class I_class_study implements I_study {

	public static void main(String[] args) {
		
		
		I_class_study obj=new I_class_study();
		
		String name2 = obj.name;
		
		System.out.println(name2);
			
		
		I_study.im5();
		
		obj.im1();
		obj.im2();

	}

	@Override
	public void im1() {
			
		System.out.println("hi i am implemented method im1 ");
		
	}

	@Override
	public void im2() {
		
		System.out.println("hi i am implemented method im2 ");

	}
	

}
