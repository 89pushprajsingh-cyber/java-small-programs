import java.util.*;
public class Digits {
    public static void main(String args []){
        // Take an input from user and print each no.
         Scanner sc= new Scanner (System.in);
         int n=sc.nextInt();        
   while(n>0) {
   int r= n%10;
   n=n/10;
   System.out.println(r);
   }
}
    
}
