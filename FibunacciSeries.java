import java .util.*;

public class FibunacciSeries{
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of terms in fibunacci series:");
        int n = sc.nextInt();
        int a=0; 
        int b=1;
        int c = a+b;
        for(int i=1; i<=n; i++){
            System.out.print(a +" ");
            a=b;
            b=c;
            c=a+b;

        }
    }
}