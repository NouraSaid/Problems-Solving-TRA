public class HiByeByeHi {
    
    
    
    public static void main(String[] args) {
        String result = abba("Hi", "Bye");
        System.out.println(result);
    }

    public static String abba(String a, String b) {
        return a + b + b + a;
    }
}
