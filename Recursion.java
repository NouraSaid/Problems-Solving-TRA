
class HelloWorld {
         public static void main(String[] args) {
    
       int number = 5464;
        int rev = 0;
        
        while(number != 0) {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number /= 10;
        }
        
        System.out.println(rev);
    }
}


1- class HelloWorld {
    public static void main(String[] args) {
        int userAge=25;
        System.out.println(userAge);
    }
}

2- import java.util.Scanner;
public class JavaExample {

 public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scan.nextDouble();
        scan.close();
        System.out.print("The average of entered numbers is:" + avr(num1, num2, num3) );
    }

  public static double avr(double a, double b, double c)
    {
        return (a + b + c) / 3;
    }
}
