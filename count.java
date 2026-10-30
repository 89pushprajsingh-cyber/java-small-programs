import java.util.*;

public class count {
    public static int Counting(int n){
        int count = 0;
        while(n>0){
              n=n/10;
          
           count++;
        }
        return count;
    }

public static void main(String args []){
    Scanner sc= new Scanner (System.in);
    int n= sc.nextInt();
    int count = Counting(n);
    System.out.println(count);
}

}
