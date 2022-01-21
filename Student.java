package student;
import java.util.Scanner;

public class Student {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollno,m1,m2,m3,total,percentage;
		String name;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name: ");
		name=sc.nextLine();
		System.out.println("Enter your Roll_no: ");
		
		rollno=sc.nextInt();
		
		System.out.println("Enter your Mark1: ");
		m1=sc.nextInt();
		System.out.println("Enter your Mark2: ");
		m2=sc.nextInt();
		System.out.println("Enter your Mark3: ");
		m3=sc.nextInt();
		total=m1+m2+m3;
		System.out.println(" Your Total mark is: "+total);
		percentage=((total*100)/300);
		System.out.println("Percentage: "+percentage+"%");

	}

}
