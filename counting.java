public class counting {
    public static void main(String args[]){

        // we have to cound number of odd and even numbers in 2D array;

        int [][] arr = {{12,5,8}, {3,19,7}, {10, 2,15}};
        int evenCount = 0;
        int oddCount = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]%2==0){
                    evenCount++;
                }
                else{
                    oddCount++;
                }
            }
        }
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);

        System.out.println(arr[1][2]);

    }
    
}
