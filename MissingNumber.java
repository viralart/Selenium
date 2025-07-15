import java.util.Scanner;

public class MissingNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num-1;i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
         int expectedSum = num * (num + 1) / 2;
        
        // Calculate the actual sum of the array elements
        int actualSum = 0;
        for (int i = 0; i < num - 1; i++) {
            actualSum += arr[i];
        }
        
        // The missing number is the difference between the expected and actual sums
        int missingNumber = expectedSum - actualSum;
        
        System.out.println("The missing number is: " + missingNumber);
    }
}
