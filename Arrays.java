import java.util.*;

    public class Arrays {
        public static void main(String args[]){
           

      // 2d arrays is like matrix in maths
      //it is zeroth indexed */
      //for 1d array syntax is type [] numbers = new type[size];
      //for 2d array syntax is type [][] numbers = new type [3][4];
       Scanner sc= new Scanner(System.in);
       int rows = sc.nextInt();
       int cols = sc.nextInt();

       int [][] numbers = new int [rows][cols];
       //input
       //outer loop is for rows and inner loop for columns
       for (int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            numbers[i][j]=sc.nextInt();
        }

       }

       //output
       for (int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            System.out.print(numbers[i][j] + " ") ;
          }
          System.out.println();
       }

       int x= sc.nextInt();
       for (int i=0; i<rows; i++){
        for (int j=0; j<cols; j++){
            if(numbers[i][j]==x)
            {
                System.out.print("X is found at index: " +i +" "+j);
            }
        }
       }
        }
}
