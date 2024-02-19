public class Main {
    public static void main(String[] args) {

            String result = orderMentioned("Hi", "Bye");
            System.out.println(result);
        }

        public static String orderMentioned(String a, String b) {
            return a + b + b + a;
        }
    }
