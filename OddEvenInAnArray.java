public class OddEvenInAnArray {
    public static void main(String args[]){
        // int arr[] = {1,2,3,4,5}, even=0, odd=0;
        // for(int i= 0;i<arr.length;i++){
        //     if(arr[i]%2==0){
        //         even++;
        //     }else{
        //         odd++;
        //     }
        // }
        // System.out.println("Even "+even+" "+"Odd "+odd);

        int arr[][] ={{1,2},{3,4},{5,6}}, even=0,odd=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
        }
        System.out.println("Even "+even+" "+"Odd "+odd);
    }
}
