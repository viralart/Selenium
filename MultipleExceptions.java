public class MultipleExceptions {
    public static void main(String args[]){
        String s = "Welcom";
        try{
            System.out.println(s.length());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Exception exited");
        }
    }
}
