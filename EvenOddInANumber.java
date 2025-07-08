public class EvenOddInANumber {
    public static void main(String args[]){
        int number = 123456789, ans, even=0, odd=0;
        while(number != 0){
            ans = number%10;
            if(ans%2 ==0){
                even++;
            }else{
                odd++;
            }
            number = number/10;
        }
        System.out.println(even+" Even & "+odd+ " odd numbers ");
    }
}
