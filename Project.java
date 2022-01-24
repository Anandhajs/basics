package project;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//import miniProject.Project1;

class Project1 {
	int a[][]= {{5,4,3},{4,3,2},{5,2,3}};
	int b[][]= {{1,2,3},{2,3,1},{1,2,5}};
	int c[][]=new int[3][3];
	public void show()
	{
	System.out.println("Hello Java");
	}
		
		public void Add()
		{
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=b[i].length-1;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print("\t" +c[i][j]);
			}
			System.out.println();
		}  
		}
			public void Multiplication()
			{
				for(int i=0;i<a.length;i++){    
					for(int j=0;j<a[i].length;j++){    
					c[i][j]=0;      
					for(int k=0;k<b[j].length;k++)      
					{      
					c[i][j]+=a[i][j]*b[k][j];      
					}  
					System.out.print(c[i][j]+" ");  
					}  
					System.out.println();
				}
			}
			public void Binary()
			{
				int B[]= {28,45,40,50,60};
				int k=40;
				Arrays.sort(B);
				int result = Arrays.binarySearch(B,k);
				if(result<0)
				{
					System.out.println("Elements are not Found!");
				}else {
				System.out.println("The elements in: "+result);
				}
			}
		public void ArrayReverse()
		{
			 int r[]=new int[] {4,9,2,6,8};
				for(int i=0;i<r.length;i++)
				{
			
				System.out.print(r[i]+" ");
				
				}
				System.out.println();
				for(int i=r.length-1;i>=0;i--)
				{
				System.out.print(r[i]+" ");
				} 
				System.out.println();
		}
		public void Random()
		{
			int R[]=new int[] {4,9,2,6,8};
			int b=R[new Random().nextInt(R.length)];
			System.out.println(b);
		}
}
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opt=0;
		Project1 obj=new Project1();
			obj.show();
			for(int i=0;i<5;i++) {
				
			System.out.println("1. Add Two Arrays:-");
			System.out.println("2. Multiplication of Two Arrays:-");
			System.out.println("3. Arrays BinarySearch:-");
			System.out.println("4. ArrayReverse:-");
			System.out.println("5. RandomArrays:-");
			System.out.println(" Select The Option");
			Scanner sc=new  Scanner(System.in);
			opt=sc.nextInt();
			switch(opt)
			{
			case 1:
				obj.Add();
				break;
			case 2:
				obj.Multiplication();
				break;
			case 3:
				obj.Binary();
				break;
			case 4: 
				obj.ArrayReverse();
				break;
			case 5:
				obj.Random();
				break; 
			default:
				System.out.println("Your Option is Wrong");
				break;	
			}
			}
	}

}
