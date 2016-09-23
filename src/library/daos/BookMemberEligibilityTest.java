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
		 
		 else if(member.equalsIgnoreCase("member2"))
		 {
			 member2=  member2 - 10;//member2 loses book points for loan
			 System.out.println("Remaining balance is : "+ member2);//printing the result value
		 }
		 else if(member.equalsIgnoreCase("member3"))
		 {
			 member3=  member3 - 10;//member3 loses book points for loan
			 System.out.println("Remaining balance is : "+ member3);//printing the result value
		 }
		 else if(member.equalsIgnoreCase("member4"))
		 {
			 member4=  member4 - 10;//member4 loses book points for loan
			 System.out.println("Remaining balance is : "+ member4);//printing the result value
		 }
		 else if(member.equalsIgnoreCase("member5"))
		 {
			 member5=  member5 - 10;//member5 loses book points for loan
			 System.out.println("Remaining balance is : "+ member5);//printing the result value
		 }
		 
	}

}
