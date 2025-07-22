public class DataConversionMethod {
    public static void main(String args[]){
        String str = "100";
        System.out.println(Integer.parseInt(str));

        String str1 = "34.5";
        System.out.println(Double.parseDouble(str1));

        String str2 = "true";
        System.out.println(Boolean.parseBoolean(str2));

        int a=10;
        Double b = 10.4;
        char ch = 'A';
        Boolean bool = false;

        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(ch));
        System.out.println(String.valueOf(bool));
    }
    
}
