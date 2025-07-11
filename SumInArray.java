public class SumInArray {
    public static void main(String[] args) {
        // int arr[] = {1,2,3},res=0;
        // for(int i=0;i<arr.length-1;i++){
        //     res = arr[i] + arr[i+1];
        // }
        // System.out.println(res);

        int arr[][] ={{1,2},{3,4},{5,6}}, res=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr[i].length-1;j++){
                res = arr[i][j] + arr[i+1][j+1];
            }
        }
        System.out.println(res);
    }
}
