public class arrays {
    public static void main(String args[]){
        int arr[] = {100,200,300,400,500};
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        // int arr2[][] = new int[4][4];
        int[][] arr2 = {{200,100}, {300,400}, {500,600}};
        System.out.println(arr2.length);
        for(int i=0;i< arr2.length;i++){
            for(int j=0;j< arr2[i].length;j++){
                System.out.println(arr2[i][j]);
            }
        }
    } 
}
