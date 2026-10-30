public class nnewArray {
    public static void main(String args []){

        int [] arr = {10,20,30,40,50};
        int sum = 0;
        int count =0;

        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            count++;
        }
         System.out.println(sum);
         System.out.println(count);
    }
}
