package touppercase;

import java.util.Scanner;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n;
			
			Scanner x=new Scanner(System.in);
			n=x.nextInt();
			//Scanner sc=new Scanner(System.in);
			
			
			x.skip(System.lineSeparator());
			String m[]=new String[n];
			

			for(int i=0;i<m.length;i++) {
			
			
				m[i]=x.nextLine();
				
			}
			
			
			for(int i=0;i<m.length;i++) {
			
			
				System.out.println(m[i].toUpperCase());
				
			}
				
	}
}
