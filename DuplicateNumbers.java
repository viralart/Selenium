public class DuplicateNumbers {
    public static void main(String args[]){
        int arr[]={100,200,300,400,500,100,600,700,100,800,900};
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == 100){
                count++;
            }
        }
        System.out.println(count);
    }
}
