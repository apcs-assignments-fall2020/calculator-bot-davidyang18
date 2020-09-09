import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if (a > b && a > c) {
           int x  = Math.max(b,c);
           System.out.println("The second large number is " + x);
        }
        else if (b > a && b > c) {
            int y = Math.max(a,c);
            System.out.println("The second large number is " + y);
        }
        else {
            int z = Math.max(a,b);
            System.out.println("The second large number is " + z);
        }
        return c;
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int d = Math.abs(a);
        int e = Math.abs(b);
        if (d > e) {
            return d;
        } else {
            return e;
        }
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double c = Math.pow(a,2) + Math.pow(b,2);
        double d = Math.sqrt(c);
        return d;
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.print("Please type in the command.");
        String name = scan.next();
        System.out.println(name + "is activated.");
        if (name.equals("median")) {
            System.out.println("What's your first number?");
            int f = scan.nextInt();
            System.out.println("What's your second number?");
            int g = scan.nextInt();
            System.out.println("What's your third number?");
            int h = scan.nextInt();
            System.out.println("The median of your inputs is " + median(f, g, h));
        }
        else if (name.equals("magnitude")) {
            System.out.println("What's your first number?");
            int i = scan.nextInt();
            System.out.println("What's your second number?");
            int j = scan.nextInt();
            System.out.println("The magnitude of your inputs is " + magnitude(i,j));    
        }
        else {
            System.out.println("What's your first number?");
            int k = scan.nextInt();
            System.out.println("What's your second number?");
            int l = scan.nextInt();
            System.out.println("The pythagora of your inputs is " + pythagoras(k, l));
        }
    }   
}
