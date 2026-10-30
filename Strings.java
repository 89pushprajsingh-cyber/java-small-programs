import java.util.*;
public class Strings {
    public static void main(String[] args){
        
        StringBuilder sb= new StringBuilder("Tony");
        System.out.println(sb);

        //
        System.out.println(sb.charAt(0));
        //set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);
    
        // to insert any charcter at given index

        sb.insert(0, 'S');
        // output will be STony

        sb.insert(2,'n');
        System.out.print(sb);

        System.out.println(sb);
        //delete the extra 'n'
        sb.delete(2 , 3);
    }
}
