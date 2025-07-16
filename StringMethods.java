public class StringMethods {
    public static void main(String args[]){
        String str = "welcome";
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.trim().length());

        System.out.println(str.contains("wel"));
                System.out.println(str.contains("COME"));        
                System.out.println(str.contains("welme"));

                String str2 = "WEOME";

                System.out.println(str.equals(str2)); //false
                System.out.println(str.equalsIgnoreCase(str2));

                System.out.println(str.replace('e','x'));

                System.out.println(str.substring(1,5));
    }
}
