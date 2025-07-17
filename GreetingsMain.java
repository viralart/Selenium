public class GreetingsMain {
    public static void main(String args[]){
        Greetings gr = new Greetings();
        gr.m1();
        String s = gr.m2();
        System.out.println(s);
        String str = "Viral";
        gr.m3(str);
        int total = gr.m4(5, 5);
        System.out.println(total);
    }
}
