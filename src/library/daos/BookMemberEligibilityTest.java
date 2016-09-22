package library.daos;

import java.util.Scanner;

public class BookMemberEligibilityTest {
	
	public static void main(String[] args)
	{
	    String member;
		int member1= 100;
		int member2 = 90;
		int member3=80;
		int member4= 100;
		int member5=10;
		
		
		Scanner in = new Scanner(System.in);  //Taking the input as member
		 
		 System.out.println("Enter the Author name");  //Inputs for member-name
		 member = in.nextLine();// processing input
		 
		 if(member.equalsIgnoreCase("member1"))
		 {
			  member1=  member1 - 10;//member1 loses book points for loan
			  System.out.println("Remaining balance is : "+ member1);//printing the result value
			  
		 }
		 
	}

}
