public class SumInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3},res=0;
        for(int i=0;i<arr.length-1;i++){
            res = arr[i] + arr[i+1];
        }
        System.out.println(res);
    }
}
