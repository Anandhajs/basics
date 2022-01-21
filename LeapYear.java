package leapyear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		//System.out.println("Enter the year:");
		//Scanner sc=new Scanner(System.in);
		//year=sc.nextInt();
		for(year=2000;year<2021;year++)
		{
		if(year % 4 == 0) {
			 System.out.println(year + ": Leap year.");
		  }else{
			 System.out.println(year + ": Not a leap year.");
		  }
		}
	}

}
