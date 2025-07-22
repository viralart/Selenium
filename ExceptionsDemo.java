import java.util.Scanner;

public class ExceptionsDemo {
    public static void main(String args[]){
        System.out.println("program started");
            Scanner sc = new Scanner(System.in);
            int sum = sc.nextInt();
            sc.close();
            try{
                System.out.println(100/sum);
            }
            catch(ArithmeticException e){
                System.out.println("Invalid Data");
            }
        System.out.println(("program completed"));
        System.out.println(("program exited"));
    }
}
