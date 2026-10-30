import java.util.*;
public class calculater {

    // Sum of two  numbers 

   /*  public static int calculateSum(int a,int b){
       int sum = a+b;
        return sum;
    }*/

        // product of two numbers 

     /*   public static int calculateProduct(int a , int b){
        int product = a * b;
        return product ;
        }
        

        
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = calculateProduct(a,b);
        System.out.println(product);
        */
    

        // we have to write fCTORIAL OF A GIVEN NUMBER

        public static void printFactorial(int a){
           int factorial = 1; 
           for(int i=a; i>=1; i--){
             
             factorial = factorial*i;

            }
          System.out.println(factorial); 
          return;
        }

        public static void main(String args []){
            Scanner sc = new Scanner (System.in);
            int a= sc.nextInt();
           printFactorial(a);

        }

}
