// 10. Print a Number in Reverse

public class Reverse {
    public static void reverse(int n) {
        if (n == 0) return;
        System.out.print(n % 10);
        reverse(n / 10);
    }

    public static void main(String[] args) {
        reverse(1234);
    }
}