import java.util.Scanner;
public class Sin {
    static double giaithua(int n) {
        if (n == 0) return 1;
        else    return (n * giaithua(n - 1));
    }
    static double mu(double x, int n) {
        double k = 1;
        for (int i = 1; i <= n; i++) k *= x;
        return k;
    }
    static double khaitrien(double x) {
        double sum = 1;
        for (int i = 1; i <= 100; i++) {
            sum += (mu(x, i) / giaithua(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        double x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        System.out.println(khaitrien(x));
    }
}
