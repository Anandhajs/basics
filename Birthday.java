package birthday1;

import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				int x=2020;
				String n,year;
				
				int age;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Your Name and Year of Birth:  ");
			
				String[] a=sc.nextLine().split("  ");
			n=a[0];
			year=a[1];
			Integer k=Integer.parseInt(year);
			age=x-k;
		//String t=String.valueOf(age);
			System.out.print("Happy Birthday  "+n+"!  Your age is: " +age);
				
			}


	}

