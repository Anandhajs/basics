import java.util.Arrays;
public class BinarySearch
{
  /*	public static void binarysearch(int a[],int F,int L,int k)
	{
		Arrays.sort(a);
		int m=(F+L)/2;
	while(F<=L)
		
		{
			if(a[m]<k)
			{
				F=m+1;	
			}else if(a[m]==k)
			{
			
			System.out.println("The elements in: "+m);
			break;
			}
			else {
			L=m-1;
			}
	
		m=(F+L)/2;
		}
		if(F>L)
		{
			System.out.println("Elements are not Found!");
		}
	}   
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			int a[]= {28,45,40,50,60};
			int k=50;
			int L=a.length-1;
			binarysearch(a,0,L,k);
	
	}    */
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			int a[]= {28,45,40,50,60};
			int k=70;
			//int L=a.length-1;
			Arrays.sort(a);
			int result = Arrays.binarySearch(a,k);
			if(result<0)
			{
				System.out.println("Elements are not Found!");
			}else {
			System.out.println("The elements in: "+result);
			}
		}

}
