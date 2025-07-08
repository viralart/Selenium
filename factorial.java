public class factorial {
    public static void main(String[] args) {
        int num = 9, rem=0;
        for(int i=num;i>0;i--){
            rem = num % 10;
            rem = rem*i;
            num = num/10;
        }
        System.out.println(rem);
    }
}
