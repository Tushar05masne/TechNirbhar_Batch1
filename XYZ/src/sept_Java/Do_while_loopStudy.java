package sept_Java;

public class Do_while_loopStudy {
	
	
	//do-while---> do block of code will execute atleat once
	//then updation and based on condition check iteration will take place
	
	//do{
	 //block of code or logic
    //}while(condition)

	public static void main(String[] args) {
		
		int i=10;
		do {
		   System.out.println(i);
		   i--;
		   
		   if(i==-1) {
		   System.out.println("checking updation "+i);
		   }
		
		}while(i>=0);
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		int p=2;
		
		do {
			System.out.println(p);
			p=p+2;
		}while(p<=20);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		//1-100----all even number print 

		int z=1;
		
		do {
			
			//System.out.println(z);
			
			if(z%2==0) {
				
				System.out.println(z);

			}
			z++;

			
		}while(z<=100);
		
	}

}
