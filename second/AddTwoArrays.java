package second;

public class AddTwoArrays {
	public void add()
	{
		int a[][]= {{4,5,4,8},{5,9,3,1}};
		int b[][]= {{5,2,3,1},{8,4,6,4}};
		int  c[][]=new int[2][4];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				c[i][j]+=a[i][j]+b[i][j];
				System.out.print("\t" +c[i][j]);
			}
			System.out.println();
		}  
	}
	
	/*public static void main(String args[]) {
		AddTwoArrays obj=new AddTwoArrays();
		obj.add();
	}*/
}