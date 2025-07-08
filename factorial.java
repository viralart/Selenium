public class factorial {
    public static void main(String[] args) {
        int num = 5, rem=1;
       for (int i = 2; i <= num; i++)
            rem *= i;
        System.out.println(rem);
    }
}
