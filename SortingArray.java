import java.util.Scanner;

public class SortingArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n - 1; i++) {  // Loop for number of passes
            for (int j = 0; j < n - 1 - i; j++) {  // Loop for each pair comparison
                if (arr[j] > arr[j + 1]) {
                    // Swap if elements are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
                                                                                                                   