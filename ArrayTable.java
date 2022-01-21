
public class ArrayTable {
	 public static void matrix(int size,int row,int[][] matrix){

         for(int i = 0;i <  7 * size ;i++){ 
               System.out.print("-");    
         }
              System.out.println("-");

         for(int i = 1;i <= matrix[row].length;i++){
            System.out.printf("| %4d ",matrix[row][i - 1]);
          }
            System.out.println("|");


              if(row == size -1){

                 for(int i = 0;i <  7 * size ;i++){ 
                       System.out.print("-");
                  }
                       System.out.println("-");

               }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16} };

	     int rowsLength = matrix.length;

	          for(int k = 0; k < rowsLength; k++){

	              matrix(rowsLength,k,matrix);
	          }
	}
	
	}


