import java.util.*;
public class SumOddEven {
    public static void main(String args[]){
        // take a number and print sum of odd  number and sum of even numbers
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int evensum=0;
        int oddsum=0;
        while(n!=0){
            int r=n%10;
            n=n/10;
            if(r%2==0){

                evensum=evensum+r;
                System.out.println("sum of even numbers:"+evensum);
            } else{
                oddsum=oddsum+r;
                System.out.println("Sum of odd numbers:"+oddsum);
            }

        }

    }
}
