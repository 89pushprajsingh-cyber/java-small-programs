import java.util.*;
public class Array1 {
   // find the second largest element in the array
   public static void main(String args[]){
    int arr[]= {1,2,3,4,5,6,7,8,9};
    int largest =0;
    int secondLargest=0;
    for (int i=0; i<arr.length; i++){
        if(arr[i]>largest){
           secondLargest=largest;
           largest=arr[i];
           
        }
    }
    System.out.println("largest"+ largest);
    System.out.println("secondLargest"+ secondLargest);
   }
    
}
