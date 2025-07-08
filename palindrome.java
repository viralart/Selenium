public class palindrome {
    public static void main(String args[]){
        int number = 121, rem=0,ans=0;
        int num2 = number;
        while(number!=0){
            rem = number%10;
            ans = ans * 10 + rem;
            number = number/10;
        }

        if(num2 == ans){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
