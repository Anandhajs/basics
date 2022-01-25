package second;
import java.util.Arrays;
public class BinarySearch
{
  public void binary()
  {
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
		/*public static void main(String[] args) 
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

}*/
