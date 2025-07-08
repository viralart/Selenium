public class ReverseANumber {
    public static void main(String args[]){
        int number = 123, rem=0, ans = 0;
       while(number!=0){
            rem = number % 10; //3
            ans = ans * 10 + rem;
            number = number / 10; 
        }
        System.out.println(ans);
    }
}
