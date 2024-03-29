import java.util.*;

public class gcd_lcm {
    public static Scanner scn = new Scanner(System.in);

    public static int LCM(int a, int b, int gcd) {
        return ((a / gcd) * b);
    }

    public static int GCD(int a, int b) {
        int divisor = a;
        int dividend = b;

        while (dividend % divisor != 0) {
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        return divisor;
    }

    public static void main(String[] args) {
        System.out.println("Give the input");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int gcd = GCD(a, b);
        System.out.println(gcd);
        System.out.println(LCM(a, b, gcd));
    }
}