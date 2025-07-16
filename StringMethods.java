import java.util.Arrays;

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

                str = "viral@gmail.com";
                String a[] = str.split("@");
                System.out.println(a[0]);
                System.out.println(a[1]);
                 System.out.println(Arrays.toString(a));

                 str= "Viral Kumar";
                 System.out.println(str.contains("viral"));
                 System.out.println(str.toLowerCase().contains("viral"));
    }
}
