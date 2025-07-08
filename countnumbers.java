public class countnumbers {
    public static void main(String args[]){
        long number = 232416789746234332L, count=0;
        while(number!=0){
            count++;
            number = number /10;
            
        }
        System.out.println(count);
    }
}
