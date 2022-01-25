package second;
//Array operations

import java.util.Arrays;
import java.util.Random;

public class ArrayReverse {
public void arrayReverse()
{
	 int a[]=new int[] {4,9,2,6,8};
		for(int i=0;i<a.length;i++)
		{
	
		System.out.print(a[i]+" ");
		
		}
		System.out.println();
		for(int i=a.length-1;i>=0;i--)
		{
		System.out.print(a[i]+" ");
		}  
}
}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  Array Empty or Not
		
			int a[]=new int[] {};
			boolean empty=a==null || a.length==0;
			System.out.println(empty);   
		
		
		// Compare Two Arrays
		
		  int a[]=new int[] {4,9,2,6,8};
			int b[]=new int[] {4,9,2,6,8};
			boolean c=Arrays.equals(a, b);
			System.out.println(c); 
		
		
		
		 Append the new Item to an Array
		
		  int c=22;
			int a[]=new int[] {4,9,2,6,8};
			int b[]=Arrays.copyOf(a, a.length+1);
			b[b.length-1]=c;
			String a1,b1;
			a1=Arrays.toString(a);
			System.out.println("Elements of Array a:  "+a1);
			b1=Arrays.toString(b);
			System.out.println("Elements of Array b:  "+b1);  
		
		//Random Value of an Array
		
		/*  int a[]=new int[] {4,9,2,6,8};
			int b=a[new Random().nextInt(a.length)];
			System.out.println(b);   
		
		
		//First and Last Elements
		
		 	int a[]=new int[] {4,9,2,6,8}; 
		  	int first=a[0];
			System.out.println(first);
			int last=a[a.length-1];
			System.out.println(last);  
		
		
		//Reverse the Array
		
		  int a[]=new int[] {4,9,2,6,8};
			for(int i=0;i<a.length;i++)
			{
		
			System.out.print(a[i]+" ");
			
			}
			System.out.println();
			for(int i=a.length-1;i>=0;i--)
			{
			System.out.print(a[i]+" ");
			}  
	}

}*/
