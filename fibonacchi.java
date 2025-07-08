public class fibonacchi {
    public static void main(String args[]){
        int num = 25;
        int first = 0, second = 1;
        int third=0;
        System.out.print(first+" "+second+" ");
        for(int i=2;i<num;i++){
            third = first + second;
            System.out.print(third+" ");
            first = second;
            second = third;
            
        }
    }
}
