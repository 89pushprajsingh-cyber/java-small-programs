import java.util.Scanner;
  public class Calculator {
  
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
     
        int arr [] = {18, 19, 5, 8, 2};
        int temp = 0;
        for(int i=0; i<arr.length; i++){
          if(arr[i]>arr[i+1]){
            arr[i]= temp;
            arr[i+1]= arr[i];
             

          }
        } System.out.println(temp);

    }
  }