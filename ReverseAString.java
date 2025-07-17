public class ReverseAString {
    public static void main(String args[]){
        // String str = "welcome";
        // for(int i=str.length()-1;i>=0;i--){
        //     System.out.print(str.charAt(i));
        // }

        // char a[] = str.toCharArray();
        // for(int i=a.length-1;i>=0;i--){
        //     System.out.print(a[i]);
        // }

        StringBuffer str = new StringBuffer("welcome");
        System.out.println(str.reverse());

        StringBuilder str2 = new StringBuilder("w el co m e");
        System.out.println();
    }
}
