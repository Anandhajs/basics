package addTwoArrays;

public class AddTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using 2D Array
		
			int a[][]= {{4,5,4,8},{5,9,3,1}};
			int b[][]= {{5,2,3,1},{8,4,6,4}};
			int  c[][]=new int[5][5];
			for(int i=0;i<=a.length-1;i++)
			{
				for(int j=0;j<=b[i].length-1;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
					System.out.print("\t" +c[i][j]);
				}
				System.out.println();
			}  
		
		
		//using single Array
		
		/*		int a[]= {4,6,9,3};
				int b[]= {7,4,9,2};
				int sum[]=new int[b.length];
				for(int i=0;i<b.length;i++)
				{
					sum[i]=a[i]+b[i];
					System.out.print("\t"+sum[i]);
				}  */
	}

}