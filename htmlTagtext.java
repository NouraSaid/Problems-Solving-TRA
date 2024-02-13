public class html {
    
    
    public static void main(String[] args) {
        String  tag= "i"; 
        String text = "Yay";

        String htmlString = html(tag, text);
        System.out.println(htmlString);
    }

    public static String html(String tag, String text) {
        return "<"+ tag +">" + text +"</" + tag +">";
    }
}