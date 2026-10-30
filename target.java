public class target {
    public static void main(String args[]){

     /*    int arr []= {1,2,3,4,5};
        // find pair whose sum is 7;

        int target=7;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("pair is :"+ arr[i] +" "+arr[j]);
                }
            }
        }*/

            int arr[][]= {{1,2,3}, {4,5,6}, {7,8,9}};
            int row =3;
            int cols=3;

            for (int i=0; i<row; i++){
                for(int j=0; j<cols; j++){
                    System.out.print(arr[i][j]);
                }
            } System.out.println();
    }

}
