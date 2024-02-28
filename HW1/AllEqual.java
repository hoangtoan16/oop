import java.util.Scanner;

public class AllEqual {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a == b && b == c ) System.out.printf("equal");
        else System.out.printf("non equal");
    }
}
