public class SumOfDigits {
    public static void main(String args[]){
        int number = 1234, ans=0, rem;
        while (number!=0) {
            rem = number % 10;
            ans = ans + rem;
            number= number/10;
        }
        System.out.println(ans);
    }
}
