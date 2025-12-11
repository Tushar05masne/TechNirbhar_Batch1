package array_Study;


public class Array1 {
	
	float f=34.5f;
	double d=34.5;



	public static void main(String[] args) {
		
		
	  //  int [] age_of_people=new int[200];
	    
	    int  age_of_people []=new int[200];
	    
	    byte[] b=new byte[20];
	    short[] s=new short[20];
	    
	    Object[] obj=new Object[20];
	    
	    obj[0]="Gajanan";
	    obj[1]='A';
	    obj[2]=46;
	    obj[3]=44.23;
	    
	    System.out.println(obj[0]);
	    System.out.println(obj[1]);
	    System.out.println(obj[2]);
	    System.out.println(obj[3]);


	    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


	    
	    
	    
	    
	    
	    


	    float [] f_values= {(float) 34.45,(float) 22.22,(float) 12.22,34457454658845.5574574567845647675674f};
	    
	    double [] d_values= {34.45,22.22,12.22, 34.55};
	    
	    System.out.println(d_values[0]);
	    System.out.println(d_values[1]);
	    System.out.println(d_values[2]);
	    System.out.println(d_values[3]);


	    
	    int[] num= {2,3,2,4,5,6,7,8,9};
	    
	    char[] mychr= {'Q','B','s','t'};
	    
	    String[] myStringArray= {"Bird","Animal","Human"};
	    
	    System.out.println(mychr[0]);
	    System.out.println(mychr[1]);
	    System.out.println(mychr[2]);
	    System.out.println(mychr[3]);
	    System.out.println(mychr[4]);


	    
	    System.out.println("============================================");
	    
	    System.out.println(num[8]);
	    
	    System.out.println(f_values[0]);
	    System.out.println(f_values[1]);
	    System.out.println(f_values[2]);
	    System.out.println(f_values[3]);

		
		//0,1,2,3,4,5
		
		age_of_people[0]=3;
		age_of_people[1]=34;
		age_of_people[199]=544;
		
		
//		System.out.println(age_of_people[5]);
//		
//		
		int lengthof_myArray = age_of_people.length;
//		
//		System.out.println(lengthof_myArray);
		
		for(int i=0;i<=lengthof_myArray-1;i++) {
			
			System.out.println(age_of_people[i]);
		}
		

	}

}
