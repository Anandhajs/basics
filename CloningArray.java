package cloningArray;

import java.util.Arrays;
import java.util.Scanner;

public class CloningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cloning the array
				/*	int o[];
					int c[];
					int n;
					
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter The Number Of Elements: ");
					n=sc.nextInt();
					o=new int[n];
					c=new int[n];
					System.out.println("Enter the Elements: ");
					for(int i=0;i<n;i++)
					{
						o[i]=sc.nextInt();
					}
						c=o.clone();
					System.out.println("the original elements:");
					for(int i=0;i<o.length;i++)
					{
					//String s=Arrays.toString(o);
						System.out.println(o[i]+" ");
					}
					System.out.println();
					System.out.println("The Cloning Elements are: ");
					for(int i=0;i<c.length;i++)
					{
					//String s1=Arrays.toString(c);
						System.out.println(c[i]+ " ");
					}*/
		
		//using arraycopy() method
		
		
				int O[]= {3,5,7,2};
				int C[]=new int[4];
				int N=4;
				System.arraycopy(O, 0, C, 0, N);
				System.out.println("The Original Elements are: ");
				for(int i=0;i<O.length;i++)
				{
					System.out.println(O[i]+" ");
					
				}
				
				System.out.println();
				System.out.println("The Copy Elements are: ");
				for(int i=0;i<4;i++)
				{
					System.out.println(C[i]+" ");
				}
				
	}
	}
//git push https://Anandhajs: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@https://github.com/Anandhajs/ArrayBasics.git

