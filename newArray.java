import java.util.*;
public class newArray {
    
   /* public static void main(String args[]){
        int arr[]= new int[5];
         Scanner sc= new Scanner(System.in);
          

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
         int sum=0;
        for(int i=0; i<arr.length; i++){
           
            sum+=arr[i];
            System.out.println("Sum of inputs of arrays: "+sum);
        }

        
       

    }*/

        // find the largest and smallest element;

       /*  public static void main(String args[]){
            int arr[]= {12, 23, 65, 65, 74};
            for(int i=0; i<arr.length; i++){
                int temp=0;
                temp= Math.max(temp, arr[i]);
            
                System.out.println( "Largest element is: "+temp);
            } 
          }*/

            // find the average of few given numbers;
           public static void main(String args []){
            Scanner sc = new Scanner(System.in);
            int []arr = new int [3];
            int sum=0;
            for(int i=0; i<arr.length; i++){
                arr [i]= sc.nextInt();
                sum+=arr[i];
                 
            }
           double average = (double) sum / arr.length;
                System.out.println("Average of the array elements is: " + average);
           }

                // count number of even and odd elements in an array;
          /*  public static void main(String args[]){
            
            int arr[]= {12, 23, 65, 65, 74};
            int evenCount=0;
            int oddCount=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]%2==0){
                    evenCount++;
                } else{
                    oddCount++;
                }
            }
            System.out.println("Even Count: " + evenCount);
            System.out.println("Odd Count: " + oddCount);

           }*/

            // find a number x in an array and print its index;
           /* public static void main(String args[]){
                int arr[]= {12, 23, 65, 65, 74};
                Scanner sc= new Scanner(System.in);
                int x= sc.nextInt();
                for(int i=0; i<arr.length; i++){
                    if(arr[i]==x){
                        System.out.println("X is found at index: " +i);
                    } else{
                        System.out.println("X is not found in the array");
                    }
                }
            } */

                // find the second largest element in an array;
              /*   public static void main(String args[]){

                    Scanner sc = new Scanner(System.in);
                    int arr[]= new int[3];
                    int largest=0;
                    int secondLargest=0;
                   
                    for (int i=0; i<arr.length; i++){
                        arr[i]=sc.nextInt();
                        if(arr[i]>largest){
                            secondLargest=largest;
                            largest=arr[i];
                        }
                    }
                    System.out.println("Second largest element is: " + secondLargest);
                }*/
        }

