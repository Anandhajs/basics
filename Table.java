package table;
//new branch
public class Table {
	public static void main(String args[])
	{
			int a[]= {1,2,3,4,5,6,7,8,9,10};
			int n=2;
			for(int i = 0;i < a.length ;i++)
			{ 
	            System.out.print("~");    
			}
			System.out.print("~");
			System.out.println();
			for(int i:a)
			{
				//System.out.println(i+ " * " +n+ " = "+i*n);
				System.out.printf("%d * %d = %d \n", i, n, i * n);  
			for(int j = 0;j < a.length ;j++)
			{
			
	             
	           System.out.print("~");
	      }
			System.out.println("~");
			}
			
	}

}
