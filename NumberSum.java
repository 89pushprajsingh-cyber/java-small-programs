import java.util.*;
public class NumberSum {
    public static void main(String args[]){
    
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int r=0;
        int sum=0;
        while (num>0){
            r=num%10;
            sum+=r;
              num=num/10;
            {System.out.println(sum);}
        }

    }
}
