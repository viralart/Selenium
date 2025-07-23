public class CheckedException {
    public static void main(String args[]){
        System.out.println("Program started");
        System.out.println("Program in progress");

        try{
            Thread.sleep(5000);
        }catch(Exception e){
        System.out.println(e.getMessage());
        }

        System.out.println("Program Finished");
        System.out.println("Program Exited");
    }
}
