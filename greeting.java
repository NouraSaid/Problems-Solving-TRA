public class greeting {
    
    
    
    public static void main(String[] args) {
        String name = "Bob";
        String greeting = GG(name);
        System.out.println(greeting);
    }
    public static String GG(String name) {
        return "Hello " + name + "!";
    }
}