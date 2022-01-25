package second;

public class TwoDArrays {
public void multiplication()
{
	int a[][]= {{5,4,3},{4,3,2},{5,2,3}};
	int b[][]= {{1,2,3},{2,3,1},{1,2,5}};
	int c[][]=new int[3][3];
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
}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{5,4,3},{4,3,2},{5,2,3}};
		int b[][]= {{1,2,3},{2,3,1},{1,2,5}};
		int c[][]=new int[3][3];
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
}*/

