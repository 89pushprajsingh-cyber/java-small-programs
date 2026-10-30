public class armstrong{
    public static void main(String args[]){

        int num= 153;
        int originalNum= num;
        int sum=0;
        while(num>0){
            int r=num%10;
            sum+=r*r*r;
            num= num/10;
            if(sum==originalNum){
                System.out.print("The number is an Armstrong number." + originalNum);
            } else{
                System.out.println("The number is not an armStrong number." + originalNum);
            }
        }
    }
}
