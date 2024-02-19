public class Main {
    public static void main(String[] args) {

            String result = Order("Hi", "Bye");
            System.out.println(result);
        }

        public static String Order(String a, String b) {
            return a + b + b + a;
        }
    }
