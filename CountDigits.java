// 8. Count the Number of Digits of a Number

public class CountDigits {
    public static int count(int n) {
        if (n == 0) return 0;
        return 1 + count(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(count(1234));
    }
}
